package com.sivasankar.spring.jpa.practices.inheritance;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity(name = "MappedDebitAccount")
public class DebitAccount extends Account {

	private BigDecimal overdraftFee;

	public BigDecimal getOverdraftFee() {
		return overdraftFee;
	}

	public void setOverdraftFee(BigDecimal overdraftFee) {
		this.overdraftFee = overdraftFee;
	}

}
