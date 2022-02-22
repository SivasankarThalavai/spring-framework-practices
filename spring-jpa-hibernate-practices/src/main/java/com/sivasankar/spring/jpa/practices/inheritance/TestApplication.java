package com.sivasankar.spring.jpa.practices.inheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sivasankar.spring.jpa.practices.config.HibernateUtil;

public class TestApplication {

	public static void main(String[] args) {

		CreditAccount account = new CreditAccount();
		account.setBalance(10000);
		account.setInterestRate(10);
		account.setOwner("siva");
		account.setCreditLimit(10000);

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the account object
			session.save(account);
			// commit transaction
			transaction.commit();
		}

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			Transaction transaction1 = session.beginTransaction();
			// save the account object
			CreditAccount creditAccount = session.get(CreditAccount.class, 1L);
			System.out.println(creditAccount.getBalance());
			System.out.println(creditAccount.getId());
			// commit transaction
			transaction1.commit();
		}
	}

}
