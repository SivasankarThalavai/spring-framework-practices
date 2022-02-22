package com.sivasankar.springboot.mongodb.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Employee")
public class Employee {

	@Id
	private String empId;
	private String firstName;
	private String lastName;
	private int age;

	
	

}