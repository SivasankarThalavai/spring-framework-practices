package com.sivasankar.spring.jpa.practices.inheritance;

import javax.persistence.Entity;

@Entity(name = "MappedCreditAccount")
public class CreditAccount extends Account {

	private double creditLimit;

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

}