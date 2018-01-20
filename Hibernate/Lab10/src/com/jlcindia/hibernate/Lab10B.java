package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Lab10B {
	public static void main(String[] args) {
		org.hibernate.Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getseSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			CurrentStudent cs = new CurrentStudent("vas", "Blore", "Active",
					17000, 500, "7:00-9:00", "Mathikere");
			cs.setSid(1);
			session.save(cs);

			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}

}
