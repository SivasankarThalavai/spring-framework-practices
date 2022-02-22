package com.sivasankar.springcore.practices.gettersetterinjection;

public class Employee1 {

	private String name;
	private String empId;
	private int age;

	public Employee1(String name, String empId, int age) {
		this.name = name;
		this.empId = empId;
		this.age = age;
		System.out.println("First Constructor");
	}

	public Employee1(String name, int age, String empId) {
		this.name = name;
		this.age = age;
		this.empId = empId;
		System.out.println("Second Constructor");
	}

	public String getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
