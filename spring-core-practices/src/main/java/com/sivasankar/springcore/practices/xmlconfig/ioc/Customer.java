package com.sivasankar.springcore.practices.xmlconfig.ioc;

public class Customer {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}
}
