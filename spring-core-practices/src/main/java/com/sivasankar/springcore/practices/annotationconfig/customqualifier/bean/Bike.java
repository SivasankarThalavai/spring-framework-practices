package com.sivasankar.springcore.practices.annotationconfig.customqualifier.bean;

import org.springframework.stereotype.Component;

import com.sivasankar.springcore.practices.annotationconfig.customqualifier.Vehicle;

@Component
@com.sivasankar.springcore.practices.annotationconfig.customqualifier.annotation.Bike
public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bike started");
	}

	@Override
	public void stop() {
		System.out.println("Bike stopped");
	}
}
