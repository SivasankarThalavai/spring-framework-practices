package com.sivasankar.springcore.practices.gettersetterinjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sivasankar.springcore.practices.gettersetterinjection")
public class AppConfig {

	@Bean
	public Employee getEmployee() {
		return new EmployeeImp();
	}

	@Bean
	public Department getDepartment() {
		return new DepartmentImp();
	}
}