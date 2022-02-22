package com.sivasankar.springcore.practices.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

	@Lazy(value = true)
	@Bean
	public FirstBean firstBean() {
		return new FirstBean();
	}

	@Bean
	public SecondBean secondBean() {
		return new SecondBean();
	}
}