package com.sivasankar.spring.jpa.practices.singletableinherit;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "SingleTableCreditAccount")
@DiscriminatorValue("CREDIT_ACC")
public class CreditAccount extends Account {

	private double creditLimit;

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
}