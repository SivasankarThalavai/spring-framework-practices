package com.sivasankar.springcore.practices.pojoVSbeans;

/*
 *  The below example is a well-defined example of the POJO class.
	As you can see, there is no restriction on access-modifiers of fields. 
	They can be private, default, protected, or public. 
	It is also not necessary to include any constructor in it.
*/

public class EmployeePojo {

	// default field
	String name;

	// public field
	public String id;

	// private salary
	private double salary;

	// arg-constructor to initialize fields
	public EmployeePojo(String name, String id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	// getter method for name
	public String getName() {
		return name;
	}

	// getter method for id
	public String getId() {
		return id;
	}

	// getter method for salary
	public Double getSalary() {
		return salary;
	}

	public static void main(String[] args) {

		EmployeePojo pojo = new EmployeePojo("siva", "1046", 51000.50D);
		System.out.println(pojo.getName());

		/*
		 * If you set visibility of name to the public, then any object can use this.
		 * Suppose you want that name can’t be null. In that case, you can’t have
		 * control. Any object can set it null.
		 */

		pojo.name = "Sivasankar Thalavai";
		System.out.println(pojo.getName());
		System.out.println(pojo.name);

	}

}
