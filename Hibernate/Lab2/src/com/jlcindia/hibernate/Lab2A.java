package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Lab2A {
	public static void main(String[] args) {
		org.hibernate.Transaction tx = null;
		try {

			SessionFactory sf = HibernateUtil.getseSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = new Customer("sri", "sri@jlc", 1234, "Blore",
					25000.00);
			session.save(cust);
			tx.commit();
			session.close();
			System.out.println("Record Inserted");

		} catch (Exception e) {
			e.printStackTrace();
			try {
				if (tx != null)
					tx.rollback();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
	}
}
