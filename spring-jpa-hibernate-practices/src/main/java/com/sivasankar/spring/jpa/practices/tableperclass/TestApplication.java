package com.sivasankar.spring.jpa.practices.tableperclass;

import org.hibernate.Session;

import com.sivasankar.spring.jpa.practices.config.HibernateUtil;

public class TestApplication {

	public static void main(String[] args) {
		createEmployee();
	}

	public static void createEmployee() {
		System.out.println("****************Creating Employee*************");
		Employee emp = new Employee();
		emp.setName("John");

		ContractEmployee contEmp = new ContractEmployee();
		contEmp.setName("Mike");
		contEmp.setType("CONTRACT");

		PermanentEmployee perEmp = new PermanentEmployee();
		perEmp.setName("Jordan");
		perEmp.setType("PERMANENT");

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			session.beginTransaction();
			session.save(emp);
			session.save(contEmp);
			session.save(perEmp);
			session.getTransaction().commit();
			session.close();
		}
	}
}