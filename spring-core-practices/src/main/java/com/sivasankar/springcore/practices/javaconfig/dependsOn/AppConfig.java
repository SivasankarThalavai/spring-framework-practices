package com.sivasankar.springcore.practices.javaconfig.dependsOn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class AppConfig {

	@Bean("firstBean")
	@DependsOn(value = { "secondBean", "thirdBean" })
	public FirstBean firstBean() {
		return new FirstBean();
	}

	@Bean("secondBean")
	public SecondBean secondBean() {
		return new SecondBean();
	}

	@Bean("thirdBean")
	public ThirdBean thirdBean() {
		return new ThirdBean();
	}
}