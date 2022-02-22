package com.sivasankar.springcore.practices.scopes.singleton;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingleTonMainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AccountService service1 = context.getBean("accountService", AccountService.class);
		service1.setAccountHolder("Sivasankar");
		System.out.println(service1.getAccountHolder());

		AccountService service2 = context.getBean("accountService", AccountService.class);
		System.out.println(service2.getAccountHolder());
		context.close();
	}

}
