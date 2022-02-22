package com.sivasankar.spring.jpa.practices.jointableIheritance;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sivasankar.spring.jpa.practices.config.HibernateUtil;

public class TestApplication {

	public static void main(String[] args) {

		Transaction transaction = null;

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			// start a transaction
			transaction = session.beginTransaction();

			// save the account object
			CreditAccount account = new CreditAccount();
			account.setBalance(10000.0);
			account.setInterestRate(10.0);
			account.setOwner("Siva");
			account.setCreditLimit(10000.0);
			session.save(account);

			DebitAccount debitAccount = new DebitAccount();
			debitAccount.setBalance(10000.0);
			debitAccount.setInterestRate(10.0);
			debitAccount.setOwner("Sankar");
			debitAccount.setOverdraftFee(100.0);
			session.save(debitAccount);
			
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
