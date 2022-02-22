package com.sivasankar.springcore.practices.annotationconfig.primary;

public class GuestUser implements User {

	@Override
	public void doSomething() {
		System.out.println("Inside doSomething() method of GuestUser");
	}

}