package com.sivasankar.springcore.practices.gettersetterinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company {

	private Employee employee;

	private Department department;

	// Constructor based DI
	@Autowired
	public Company(Employee employee) {
		this.employee = employee;
	}

	// Setter method based DI
	@Autowired
	public void setDepartment(Department department) {
		this.department = department;
	}

	public void showEmployeeInfo() {
		employee.showEmployeeInfo();
	}

	public void showDepartmentInfo() {
		department.showDepartmentInfo();
	}

}