package com.sivasankar.spring.jpa.practices.cache;

import org.hibernate.Session;

import com.sivasankar.spring.jpa.practices.config.HibernateUtil;

public class EhCacheDemo {

	public static void main(String[] args) {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			System.out.println("*************Second LEvel EH VCache*******************");
			session.beginTransaction();

			session.get(Student.class, 1);

			session.getTransaction().commit();
			session.close();
		}

		try (Session session2 = HibernateUtil.getSessionFactory().openSession()) {

			session2.beginTransaction();

			session2.get(Student.class, 1);

			session2.getTransaction().commit();
			session2.close();
		}

	}

}

// O/P While Disbale Second LEvel Cache
//
//	*************Second LEvel EH VCache*******************
//	Hibernate: select student0_.id as id1_7_0_, student0_.email as email2_7_0_, student0_.first_name as first_na3_7_0_, student0_.last_name as last_nam4_7_0_ from student student0_ where student0_.id=?
//	Hibernate: select student0_.id as id1_7_0_, student0_.email as email2_7_0_, student0_.first_name as first_na3_7_0_, student0_.last_name as last_nam4_7_0_ from student student0_ where student0_.id=?

//  O/P While enable Second LEvel Cache
// 
//	*************Second LEvel EH VCache*******************
//	Hibernate: select student0_.id as id1_7_0_, student0_.email as email2_7_0_, student0_.first_name as first_na3_7_0_, student0_.last_name as last_nam4_7_0_ from student student0_ where student0_.id=?
