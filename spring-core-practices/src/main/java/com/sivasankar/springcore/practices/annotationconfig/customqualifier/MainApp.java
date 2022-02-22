package com.sivasankar.springcore.practices.annotationconfig.customqualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sivasankar.springcore.practices.annotationconfig.qualifer.service.VehicleService;

public class MainApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		// Scan beans
		context.scan("com.sivasankar.springcore.practices.annotationconfig.customqualifier.bean");
		context.scan("com.sivasankar.springcore.practices.annotationconfig.customqualifier.service");
		context.refresh();

		VehicleService vehicle = context.getBean(VehicleService.class);
		vehicle.service();

		context.close();
	}
}