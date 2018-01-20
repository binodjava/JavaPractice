package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;



public class Lab8A {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory factory = HibernateUtil.getseSessionFactory();
			Session session = factory.openSession();
			tx = session.beginTransaction();

			// 1.Adding the Student
			Student stu = new Student("sri", "Blore", "Enabled", 15000.00);
			Integer it = (Integer) session.save(stu);
			System.out.println(it.intValue());

			// 2.Adding the CurrentStudent
			CurrentStudent cstu = new CurrentStudent("vas", "Blore", "Enabled",
					15000.0, 2000.0, "6:30P.M", "Mathikere");
			it = (Integer) session.save(cstu);
			System.out.println(it.intValue());

			// 3.Adding the OldStudent
			OldStudent ostu = new OldStudent("aa", "Blore", "Enabled", 15000.0,
					"SDSOFT", "aa@sd.com", 9.0);
			it = (Integer) session.save(ostu);
			System.out.println(it.intValue());

			// 4.Adding the WeekdayStudent
			WeekdayStudent wdstu = new WeekdayStudent("bb", "Blore", "Enabled",
					15000.0, 2000.0, "6:30P.M", "Mathikere", "M.Sc", "85.5", 3);
			it = (Integer) session.save(wdstu);
			System.out.println(it.intValue());

			// 5.Adding the WeekendStudent
			WeekendStudent wstu = new WeekendStudent("cc", "Blore", "Enabled",
					15000.0, 2000.0, "6:30P.M", "HSR", "SDSOFT", "cc@sd.com",
					9.0);
			it = (Integer) session.save(wstu);
			System.out.println(it.intValue());

			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if (tx != null)
				tx.rollback();
		}

	}
}
