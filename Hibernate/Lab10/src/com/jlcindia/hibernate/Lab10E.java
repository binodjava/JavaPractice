package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Lab10E {
	public static void main(String[] args) {
		org.hibernate.Transaction tx = null;
		try {
			SessionFactory sf = HibernateUtil.getseSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			WeekendStudent wds = new WeekendStudent("Srinivas", "Blore",
					"Active", 20000, 5000, "08:00-2:00", "Mathikere", "JLC",
					"srinivas@jlc.com", 1250000);
			wds.setSid(1);
			session.save(wds);

			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

	}

}
