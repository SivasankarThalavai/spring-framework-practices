package com.sivasankar.springcore.practices.annotationconfig.lazy;

public class BeanOne {

	public BeanOne() {
		System.out.println("BeanOne Initialized");
	}

	public void doSomthing() {
		System.out.println("Inside doSomthing() method of BeanOne");
	}
}