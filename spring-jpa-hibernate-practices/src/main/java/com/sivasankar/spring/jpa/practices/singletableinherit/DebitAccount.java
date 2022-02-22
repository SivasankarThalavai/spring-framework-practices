package com.sivasankar.spring.jpa.practices.singletableinherit;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "SingleTableDebitAccount")
@DiscriminatorValue("DEBIT_ACC")
public class DebitAccount extends Account {

	private double overdraftFee;

	public double getOverdraftFee() {
		return overdraftFee;
	}

	public void setOverdraftFee(double overdraftFee) {
		this.overdraftFee = overdraftFee;
	}
}