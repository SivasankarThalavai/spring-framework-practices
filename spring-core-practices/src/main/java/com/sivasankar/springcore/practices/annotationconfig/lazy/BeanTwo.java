package com.sivasankar.springcore.practices.annotationconfig.lazy;

public class BeanTwo {

	public BeanTwo() {
		System.out.println("BeanTwo Initialized");
	}

	public void doSomthing() {
		System.out.println("Inside doSomthing() method of BeanTwo");
	}
}