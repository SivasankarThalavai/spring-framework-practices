package com.sivasankar.springcore.practices.annotationconfig.beanlifecycle.initdestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sivasankar.springcore.practices.annotationconfig.beanlifecycle.MailService;

@Configuration
public class AppConfig {

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public MailService getMailService() {
		return new MailService();
	}
}