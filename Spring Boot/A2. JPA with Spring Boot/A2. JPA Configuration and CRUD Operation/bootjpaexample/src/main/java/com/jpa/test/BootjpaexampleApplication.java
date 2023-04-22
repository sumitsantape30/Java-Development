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

		/*
		User user = new User();
//		user.setId(id); set id krne ki jarurat nhi hai kyuki already auto incremented hai
		user.setName("Sumit Santape");
		user.setCity("Nagpur");
		user.setStatus("active");
		
		User user1 = userRepository.save(user);//yeh user ka object return karega aur aap isko hi print kr skte ho
		System.out.println(user1); //CRUD operation se phele JPA configure krne ke bad yeh krke dekhlena */
		
		//Insert : apko insert krna hai to pehle apko User ka object banana pdega
		User user1 = new User();
		user1.setName("Wasudeo");
		user1.setCity("Shagaon");
		user1.setStatus("Active");
		
		User user2 = new User();
		user2.setName("Tara");
		user2.setCity("Shagaon");
		user2.setStatus("Active");
		
		//saving single user, jab apke pas ek user ko save krna ho
	//	User resultUser =  userRepository.save(user1); //yeh single entity ko save krke apko apka object return krdega
	//	System.out.println(resultUser);
		
	//	User resultUser2 = userRepository.save(user2);
	//	System.out.println(resultUser2);
		
		//agar apko 10 users save krne ke hai to apko 10 times save method call krna hoga but one shot mai krna hai to aap saveAll use kr skte ho aur usko input mai hum iterable dete hai.
		// means list pass krdenge
	//	List<User> users = List.of(user1, user2);//yeh muje ek list provide krdega
	//	Iterable<User> result= userRepository.saveAll(users); // yeh iterable return karega yeh apke collection ka parent hai
		
		//iss result mai kya hai iterate krke dekhenge
	//	result.forEach(user ->{ //-> is lamba function. result se ek ek user is user variable mai ajayenge
	//		System.out.println(user);
	//	});
	//	System.out.println("done");
		
		//update: muje update krna hai to usski id chahiye hogi
		Optional<User> optinal = userRepository.findById(102);
		
		User user = optinal.get(); //uss id wala user mil jayega
		user.setName("Ankita Santape");
		user.setStatus("Java Programmer");
		
		User result=  userRepository.save(user);
		System.out.println(result);
		
		//to get the data
		//one method is findById(); this will return optional containing you data
		Iterable<User> itr = userRepository.findAll();//iterable is something which we can iterate on
//		for(User usr: itr) {
//			System.out.println(usr);
//		}
		
		//another good way of iteration
		itr.forEach(new Consumer<User>() {

			@Override
			public void accept(User t) {
				System.out.println(t);
			}
			
		}); //labmda function use krke bhi kr skte ho
		
		//Deleting the user element
		userRepository.deleteById(2); //yeh function kuch return nhi krta
		//hum delete bhi 4 tarike se kr skte hai like deleteAll etc
		System.out.println("deleted");
		
		//agar apke pas iterable hai to aap eksath kahi elements ko delete kr skte ho
		
		Iterable<User> allUsers = userRepository.findAll();
		allUsers.forEach(users -> System.out.println(users));
		
		userRepository.deleteAll(allUsers);
		

	}

}
