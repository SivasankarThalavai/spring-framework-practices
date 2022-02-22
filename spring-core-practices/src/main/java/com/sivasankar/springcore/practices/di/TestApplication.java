package com.sivasankar.springcore.practices.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sivasankar.springcore.practices.di.config.AppConfiguration;
import com.sivasankar.springcore.practices.di.constructor.ConstructorBasedInjection;
import com.sivasankar.springcore.practices.di.filed.FieldBasedInjection;
import com.sivasankar.springcore.practices.di.service.MessageService;
import com.sivasankar.springcore.practices.di.setter.SetterBasedInjection;

public class TestApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				AppConfiguration.class);

		ConstructorBasedInjection constructorBasedInjection = applicationContext
				.getBean(ConstructorBasedInjection.class);
		constructorBasedInjection.processMsg("Email message sending ");

		SetterBasedInjection SetterBasedInjection = applicationContext.getBean(SetterBasedInjection.class);
		SetterBasedInjection.processMsg("SMS message sending ");

		FieldBasedInjection fieldBasedInjection = applicationContext.getBean(FieldBasedInjection.class);
		fieldBasedInjection.processMsg("twitter message sending ");

		MessageService messageService = applicationContext.getBean(MessageService.class);
		messageService.sendMsg("This is the primary service.");

		applicationContext.close();

	}
}