package com.sivasankar.springcore.practices.annotationconfig.customqualifier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sivasankar.springcore.practices.annotationconfig.customqualifier.annotation.Bike;
import com.sivasankar.springcore.practices.annotationconfig.qualifer.bean.Vehicle;

@Component
public class VehicleService {

	@Autowired
	@Bike
	private Vehicle vehicle;

	public void service() {
		vehicle.start();
		vehicle.stop();
	}
}
