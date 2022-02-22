package com.sivasankar.springcore.practices.annotationconfig.primary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		User user = context.getBean(User.class);
		user.doSomething();

		context.close();
	}
}