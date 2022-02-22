package com.sivasankar.spring.jpa.practices.jointableIheritance;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "JoinedTableCreditAccount")
@PrimaryKeyJoinColumn(name = "account_id")
public class CreditAccount extends Account {

	private double creditLimit;

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
}