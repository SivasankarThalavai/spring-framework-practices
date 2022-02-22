package com.sivasankar.spring.jpa.practices.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	private int empId;

	@Column(name = "name")
	private String name;

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

}