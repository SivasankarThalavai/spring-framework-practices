package com.sivasankar.spring.jpa.practices.cache;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sivasankar.spring.jpa.practices.config.HibernateUtil;

public class FirstLevelCacheDemo {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Transaction transaction = null;

		Student student1 = new Student();
		student1.setFirstName("Siva");
		student1.setLastName("Thal");
		student1.setEmail("sanka@gmail.com");

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start the transaction
			transaction = session.beginTransaction();

			session.save(student1);
			transaction.commit();
		}

		try (Session session1 = HibernateUtil.getSessionFactory().openSession()) {

			// start the transaction
			transaction = session1.beginTransaction();

			// get the student entity using id
			Student student11 = session1.get(Student.class, student1.getId());

			System.out.println(student11.getFirstName());
			System.out.println(student11.getLastName());
			System.out.println(student11.getEmail());

			// commit transaction
			transaction.commit();

			boolean isStudent1ExistinFirstLEvelCaCHE = session1.contains(student11);

			System.out.println("student11 in 1 Level Cache : " + isStudent1ExistinFirstLEvelCaCHE);
			
			session1.evict(student11);
			
			boolean isStudent1ExistinFirstLEvelCaCHE1 = session1.contains(student11);

			System.out.println("student11 in 1 Level Cache : " + isStudent1ExistinFirstLEvelCaCHE1);
			

		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
		}
	}
}