package com.sivasankar.springcore.practices.annotationconfig.customqualifier.bean;

import org.springframework.stereotype.Component;

import com.sivasankar.springcore.practices.annotationconfig.customqualifier.Vehicle;

@Component
@com.sivasankar.springcore.practices.annotationconfig.customqualifier.annotation.Car
public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}

}
