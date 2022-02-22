package com.sivasankar.spring.jpa.practices.config;

import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sivasankar.spring.jpa.practices.model.Customer;

public class CustomerDao {

	public void getCustomer(int id) {

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start a transaction
			transaction = session.beginTransaction();

			// get customer entity using get() method
			Customer customer = session.get(Customer.class, id);

			if (null == customer) {
				System.out.println(" customer = " + customer);
			} else {
				System.out.println("************getCustomer********************");
				System.out.println(customer.getFirstName());
				System.out.println(customer.getEmail());
				System.out.println("********************************");
			}

			// commit transaction
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			System.out.println("********************************");
		}
	}

	public void loadCustomer(int id) {

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start a transaction
			transaction = session.beginTransaction();

			// get Student entity using load() method
			Customer customer = session.load(Customer.class, id);

			// commit transaction
			transaction.commit();

			System.out.println("************loadCustomer********************");
			System.out.println(customer.getFirstName());
			System.out.println(customer.getEmail());
			System.out.println("********************************");

		} catch (ObjectNotFoundException e) {
			if (transaction != null) {
				transaction.rollback();
			}
			System.out.println("Object Not Found Exception");
		}
	}

	public void getCustomerById(int id) {

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start a transaction
			transaction = session.beginTransaction();

			// Obtain an entity using byId() method
			System.out.println("************getCustomerById********************");
			Customer customer = session.byId(Customer.class).getReference(id);
			System.out.println(customer.getFirstName());
			System.out.println(customer.getEmail());
			System.out.println("********************************");

			// commit transaction
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public void saveCustomer(Customer customer) {

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start a transaction
			transaction = session.beginTransaction();

			// save the student object
			session.save(customer);

			// commit transaction
			transaction.commit();

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}
}