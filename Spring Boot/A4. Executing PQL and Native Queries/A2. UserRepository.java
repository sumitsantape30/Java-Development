package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.User;


public interface UserRepository extends CrudRepository<User, Integer> { 
	
	public List<User> findByName(String name); 
	
	public List<User> findByNameAndCity(String name, String city);
	
	@Query("select u FROM User u") //u is alias
	public List<User> getAllUser();
	
	//aap isme parameters bhi pass kr skte ho
	@Query("Select u from User u WHERE u.name = :n")
	public List<User> getUserByName(@Param("n") String name); //iss name mai jo value ayegi woh n mai dalni hai
	//aap @Param notation mai iss variable ko bind kr skte ho
	
	//AND bhi use kr skte ho isme
	@Query("Select u from User u WHERE u.name = :n AND u.city = :c")
	public List<User> getUserByName(@Param("n") String name, @Param("c") String city);

	//native query
	@Query(value = "select * from user", nativeQuery = true)
	public List<User> getUsers();

}
