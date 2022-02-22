package com.sivasankar.springcore.practices.annotationconfig.lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

	@Bean("beanOne")
	@Lazy(value = true)
	public BeanOne getBeanOne() {
		return new BeanOne();
	}

	@Bean("beanTwo")
	public BeanTwo getBeanTwo() {
		return new BeanTwo();
	}
}