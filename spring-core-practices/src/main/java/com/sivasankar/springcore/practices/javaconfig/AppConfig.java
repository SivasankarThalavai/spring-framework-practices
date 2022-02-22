package com.sivasankar.springcore.practices.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import com.sivasankar.springcore.practices.HelloWorld;
import com.sivasankar.springcore.practices.annotationconfig.prepost.DatabaseInitiaizer;
import com.sivasankar.springcore.practices.di.service.EmailService;
import com.sivasankar.springcore.practices.di.service.MessageService;
import com.sivasankar.springcore.practices.di.service.SMSService;
import com.sivasankar.springcore.practices.di.service.UserService;
import com.sivasankar.springcore.practices.di.service.UserServiceImpl;

@Configuration
@Import(AppConfiguration2.class)
public class AppConfig {

	@Bean
	public HelloWorld helloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.setMessage("Hello World!");
		return helloWorld;
	}

	@Bean(name = "emailService")
	public MessageService emailService() {
		return new EmailService();
	}

	@Bean(name = "smsService")
	public MessageService smsService() {
		return new SMSService();
	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public DatabaseInitiaizer databaseInitiaizer() {
		return new DatabaseInitiaizer();
	}

	@Bean
	@Scope("prototype")
	public UserService userService() {
		return new UserServiceImpl();
	}
}