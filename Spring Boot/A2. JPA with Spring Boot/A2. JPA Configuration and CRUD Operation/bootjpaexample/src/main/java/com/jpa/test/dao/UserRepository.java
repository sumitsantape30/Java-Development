package com.jpa.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.test.entities.User;

//2. interface banaye. isko sari functionalities chahiye you have to extend this class to CRUDRepository  or JPARepository
public interface UserRepository extends CrudRepository<User, Integer> { //yeh generice hai to isme apko 2 chize batani hai
	                          //T : kis type ka data you want to handle, to hum user type ka data handle krhe yaha.
	              //ID: user ki id ka type kya hai, its integer
		//iske andar kuch methods nhi likhni spring apne aap provide krdega
}
