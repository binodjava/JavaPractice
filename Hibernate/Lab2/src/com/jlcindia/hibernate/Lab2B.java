package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Lab2B {
	public static void main(String[] args) {
		org.hibernate.Transaction tx = null;
		try {

			SessionFactory sf = HibernateUtil.getseSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			Customer cust = (Customer) session.load(Customer.class, 6);//[where 1 is 1st row data]
			System.out.println(cust.getCid() + "\t" + cust.getCname() + "\t"
					+ cust.getEmail() + "\t" + cust.getPhone() + "\t"
					+ cust.getCity() + "\t" + cust.getBal());
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				try {
					tx.rollback();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
		}
	}
}
