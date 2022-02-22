package com.sivasankar.springcore.practices.annotationconfig.requiredDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {

	private BeanTwo beanTwo;

	@Required
	@Autowired // withou this line will get null pointer exception for bean 2
	public void setBeanTwo(BeanTwo beanTwo) {
		this.beanTwo = beanTwo;
	}

	public void doSomething() {
		System.out.println("Inside do doSomething() method of BeanOne");
		beanTwo.doSomething();
	}
}