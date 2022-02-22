package com.sivasankar.springcore.practices.xmlconfig.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer1 c1 = (Customer1) context.getBean("customerSetterBean");
		c1.setCity("Coimbatore");
		c1.display();

	}
}