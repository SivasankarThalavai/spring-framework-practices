package com.sivasankar.spring.jpa.practices;

import org.hibernate.Session;

import com.sivasankar.spring.jpa.practices.config.HibernateUtil;
import com.sivasankar.spring.jpa.practices.model.Employee;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		Employee emp1 = new Employee();
		emp1.setEmpId(100);
		emp1.setName("Dinesh");

		// create session
		try (Session session1 = HibernateUtil.getSessionFactory().openSession()) {
			session1.saveOrUpdate(emp1);
			session1.close();
		}
		// emp1 object in detached state now

		emp1.setName("Dinesh Rajput");// Updated Name
		// Create session again
		try (Session session2 = HibernateUtil.getSessionFactory().openSession()) {
			Employee emp2 = (Employee) session2.get(Employee.class, 100);
			// emp2 object in persistent state with id 100

			// below we try to make on detached object with id 100 to persistent state by
			// using update method of hibernate
			session2.update(emp1);// It occurs the exception NonUniqueObjectException because emp2 object is
									// having employee with same empid as 100. In order //to avoid this exception we
									// are using merge like given below instead of session.update(emp1);

			session2.merge(emp1); // it merge the object state with emp2
			session2.update(emp1); // Now it will work with exception
		}
	}
}
