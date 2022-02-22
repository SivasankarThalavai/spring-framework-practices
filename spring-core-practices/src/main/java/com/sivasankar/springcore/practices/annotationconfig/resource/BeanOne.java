package com.sivasankar.springcore.practices.annotationconfig.resource;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class BeanOne {

	private BeanTwo beanTwo;

	@Resource
	public void setBeanTwo(BeanTwo beanTwo) {
		this.beanTwo = beanTwo;
	}

	public void doSomething() {
		System.out.println("Inside do doSomething() method of BeanOne");
		beanTwo.doSomething();
	}
}