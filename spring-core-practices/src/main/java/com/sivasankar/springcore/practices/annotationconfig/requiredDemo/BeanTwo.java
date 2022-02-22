package com.sivasankar.springcore.practices.annotationconfig.requiredDemo;

import org.springframework.stereotype.Component;

@Component
public class BeanTwo {
	
	public void doSomething() {
		System.out.println("Inside do doSomething() method of BeanTwo");
	}
}
