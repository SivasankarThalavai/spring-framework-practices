package com.sivasankar.springcore.practices.annotationconfig.dependson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// remove the @DependsOn annotation from getBeanOne() method of AppConfig class, the output (i.e. order of initialization of beans) of 
// main class will be different on each run.

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BeanOne bean = context.getBean(BeanOne.class);
		bean.doSomthing();
		context.close();
	}
}