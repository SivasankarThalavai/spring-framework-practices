package com.sivasankar.spring.jpa.practices.cache;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sivasankar.spring.jpa.practices.config.HibernateUtil;

public class QueryCacheDemo {

	public static void main(String[] args) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// Begin transaction
			Transaction t = session.beginTransaction();

			// Create Employee data
			EmployeeForCache employee1 = new EmployeeForCache();
			employee1.setFirstName("John");
			employee1.setLastName("KC");
			employee1.setAge(28);
			employee1.setEducation("PG");
			employee1.setSalary(25000);

			session.save(employee1);

			// Commit the transaction and close the session
			t.commit();

			System.out.println("successfully persisted Employee details");

		}
	}

}
