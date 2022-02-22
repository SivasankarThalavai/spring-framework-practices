package com.sivasankar.springcore.practices.annotationconfig.dependson;

public class BeanThree {

	public BeanThree() {
		System.out.println("BeanThree Initialized");
	}

	public void doSomthing() {
		System.out.println("Inside doSomthing() method of BeanThree");
	}
}