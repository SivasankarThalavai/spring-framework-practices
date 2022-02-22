package com.sivasankar.spring.jpa.practices.config;

import java.util.List;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sivasankar.spring.jpa.practices.model.Customer;

public class App {

	public static void main(String[] args) {

		CustomerDao customerDao = new CustomerDao();

		Customer customer1 = new Customer("Siva", "Sankar", "sivasankar.thalavai.dev@gmail.com");
		Customer customer2 = new Customer("Sarav", "Parama", "sarav@gmail.com");

		Customer customer3 = new Customer("Jeya", "Kumar", "jeya@gmail.com");
		persistCustomer(customer3);

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start a transaction
			transaction = session.beginTransaction();

			// save the customer objects
			session.save(customer1);

			// commit transaction
			transaction.commit();

			// inside or outside the transaction
			session.save(customer2);

			// System.out.println("Customer 1 Stored id is : " + id1);
			// System.out.println("Customer 2 Stored id is : " + id2);

		} catch (Exception e) {

			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			List<Customer> customers = session.createQuery("from Customer", Customer.class).list();
			for (Customer customer : customers) {
				System.out.println(customer.toString());
			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}

		try {
			customerDao.getCustomer(11); // null
			customerDao.loadCustomer(31);
			// customerDao.getCustomerById(3);
		} catch (ObjectNotFoundException one) {

			System.out.println(one.getMessage());
		}

	}

	private static void persistCustomer(Customer customer1) {

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start a transaction
			transaction = session.beginTransaction();

			// save the student object
			session.persist(customer1);
			// session.persist(customer1);

			session.evict(customer1); // data in trans, so it will persist in db
			// session.persist(customer1); // PersistenceException!

			customer1.setFirstName("Mary");

			customer1.setLastName("Kolms");
			session.update(customer1);

			Customer mergedCustomer = (Customer) session.merge(customer1);

			// commit transaction
			transaction.commit();

			// session.persist(customer1); // cant save data in transaction

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}