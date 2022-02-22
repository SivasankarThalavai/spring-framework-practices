package com.sivasankar.springcore.practices.scope.prototype;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// prototype: Scopes a single bean definition to any number of object instances.

public class Application {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MessageService messageService = context.getBean(MessageService.class);
		messageService.setMessage("TwitterMessageService Implementation");
		System.out.println(messageService.getMessage());

		MessageService messageService1 = context.getBean(MessageService.class);
		messageService.setMessage("EmailrMessageService Implementation");
		System.out.println(messageService1.getMessage());

		/*
		 * Singleton TwitterMessageService Implementation EmailrMessageService
		 * Implementation
		 */

		// Prototype
		// TwitterMessageService Implementation
		// null

		context.close();
	}
}