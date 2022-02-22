package com.sivasankar.springcore.practices.annotationconfig.requiredDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @REquired is a method level annotation

public class RequiredDemo {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BeanOne beanOne = context.getBean(BeanOne.class);
		beanOne.doSomething();

		context.close();
	}

}
