package com.sivasankar.springcore.practices.annotationconfig.qualifer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sivasankar.springcore.practices.annotationconfig.qualifer.service.VehicleService;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		// Scan beans
		context.scan("com.sivasankar.springcore.practices.annotationconfig.qualifer.bean");
		context.scan("com.sivasankar.springcore.practices.annotationconfig.qualifer.service");
		context.refresh();

		VehicleService vehicle = context.getBean(VehicleService.class);
		vehicle.service();

		// org.springframework.beans.factory.NoUniqueBeanDefinitionException: No
		// qualifying bean of type
		// 'com.sivasankar.springcore.practices.annotationconfig.qualifer.bean.Vehicle'
		// available: expected single matching bean but found 2

		context.close();
	}
}