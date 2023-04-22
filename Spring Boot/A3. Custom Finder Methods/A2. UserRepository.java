package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;


public interface UserRepository extends CrudRepository<User, Integer> { 
	//1. yaha methods banayenge
	public List<User> findByName(String name); //findByName is important, find is introducer, ByName is my criteria aur name humari property hai
	//apko bas methods deni hai spring jpa apne aap se isko implement krdega. isko run krke dekho
	//spring data supported keywords google karo wahake keywords use kr skte ho
	
	//suppose apko username aur city ka data nikalna hoga
	public List<User> findByNameAndCity(String name, String city);
	
	//findByNameStartingWith(String prefix)
	//findByNameEndingWith(String suffix)
	//findByNameContaining(String words)
	//findByNameLike(String likePattern)
	//findByAgeLessThan(int  age)
	//findByAgeGreaterThan(int age)
	
	//data ko sort bhi kr skte ho like name wise ascending descending krna hai
	//findByNameOrderByName(String name)

}
