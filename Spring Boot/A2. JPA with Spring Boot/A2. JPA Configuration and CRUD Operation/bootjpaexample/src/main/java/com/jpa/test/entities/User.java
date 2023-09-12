package com.jpa.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//1. sabse phele user banaye. isme woh fields rahegi jo apko database mai chahiye, agar woh database mai hai to donoko map krdo like hum orm mai krte the
@Entity //When you annotate a class with @Entity, you are essentially telling JPA that instances of this class should be persisted to a relational database as rows in a corresponding database table.
public class User { //the @Entity annotation is used to indicate that a Java class is a JPA (Java Persistence API) entity.
	
	@Id //The @Id annotation is used to indicate that a field within the entity class represents the primary key of the corresponding database table.
	@GeneratedValue(strategy = GenerationType.AUTO) //The @GeneratedValue annotation is used to specify how the primary key values for entities should be generated.
	private int id; //strategy = GenerationType.AUTO indicates that the generation strategy for primary key values should be determined by the underlying database or JPA provider. The JPA provider will choose an appropriate strategy based on the database it's connected to.
	
	private String name;
	
	private String city;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String city, String status) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.status = status;
	}

	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
