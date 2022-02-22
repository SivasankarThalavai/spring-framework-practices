package com.sivasankar.springcore.practices.annotationconfig.resource;

import org.springframework.stereotype.Component;

@Component
public class BeanTwo {

	public void doSomething() {
		System.out.println("Inside do doSomething() method of BeanTwo");
	}
}