package com.sivasankar.springcore.practices.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sivasankar.springcore.practices.HelloWorld;
import com.sivasankar.springcore.practices.di.service.MessageProcessor;

public class Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld obj = (HelloWorld) applicationContext.getBean("helloWorld");
		obj.getMessage();

		MessageProcessor userService = applicationContext.getBean(MessageProcessor.class);
		userService.processMsg("twitter message sending ");
		applicationContext.close();
	}
}