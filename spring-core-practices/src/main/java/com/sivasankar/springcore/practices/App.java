package com.sivasankar.springcore.practices;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld hworld = (HelloWorld) context.getBean("helloWorldBean");
		System.out.println(hworld.showMessage());
	}
}
