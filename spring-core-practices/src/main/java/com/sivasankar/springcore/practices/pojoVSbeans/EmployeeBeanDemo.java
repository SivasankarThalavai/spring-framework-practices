package com.sivasankar.springcore.practices.pojoVSbeans;

import java.io.Serializable;

/*
 * Beans are special type of Pojos. There are some restrictions on POJO to be a
 * bean.
 * 
 * All JavaBeans are POJOs but not all POJOs are JavaBeans. Serializable i.e.
 * they should implement Serializable interface. Still, some POJOs who don’t
 * implement a Serializable interface are called POJOs because Serializable is a
 * marker interface and therefore not of many burdens. Fields should be private.
 * This is to provide complete control on fields. Fields should have getters or
 * setters or both. A no-arg constructor should be there in a bean. Fields are
 * accessed only by constructor or getter setters.
 * 
 */

class EmployeeBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// private field property
	private String name;

	EmployeeBean() {
		// No-arg constructor
	}

	// setter method for property
	public void setName(String name) {
		if (name == null) {
			name = "";
		}
		this.name = name;
	}

	// getter method for property
	public String getName() {
		if (name == null) {
			return "";
		}
		return name;
	}
}

public class EmployeeBeanDemo {

	public static void main(String[] args) {

		EmployeeBean bean = new EmployeeBean();

		bean.setName(null);
		System.out.println("After convert null to empty Str : " + bean.getName().isEmpty());

		bean.setName("Sivasankar Thalavai");
		System.out.println("After name set : " + bean.getName());

//		bean.name = "Sivasankar Thalavai";
//		System.out.println(bean.name);     // not posible to access directly

	}

}