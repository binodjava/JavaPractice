package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Lab10A {
	public static void main(String[] args) {
		org.hibernate.Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getseSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Student st = new Student("sri", "Blore", "Active", 18000);
			st.setSid(1);
			session.save(st);

			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}

}
