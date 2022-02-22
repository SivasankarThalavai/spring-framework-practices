package com.sivasankar.spring.jpa.practices.tableperclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TablePerClassPermanentEmployee")
public class PermanentEmployee extends Employee {

	@Column(name = "type")
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}