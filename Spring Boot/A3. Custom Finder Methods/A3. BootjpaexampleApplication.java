package com.jpa.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args); //4. yeh contact return krdeta hai
		UserRepository userRepository= context.getBean(UserRepository.class);//yeh muje return karega ek bean

		
		User user1 = new User();
		user1.setName("Wasudeo");
		user1.setCity("Shagaon");
		user1.setStatus("Active");
		
		User user2 = new User();
		user2.setName("Tara");
		user2.setCity("Shagaon");
		user2.setStatus("Active");
		
	
//		User resultUser =  userRepository.save(user1);
//		User resultUser2 = userRepository.save(user2);
//		System.out.println("Added in database");
//		
		List<User> users = userRepository.findByNameAndCity("Tara", "Shagaon");
		users.forEach(e -> System.out.println(e));

	}

}
