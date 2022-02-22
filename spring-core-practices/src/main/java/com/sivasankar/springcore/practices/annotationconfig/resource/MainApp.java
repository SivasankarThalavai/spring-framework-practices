package com.sivasankar.springcore.practices.annotationconfig.resource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// class, field and method level annotation.

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BeanOne beanOne = context.getBean(BeanOne.class);
		beanOne.doSomething();

		context.close();
	}
}