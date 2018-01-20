package com.jlcindia.hibernate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Lab3A {
	public static void main(String[] args) {
		try {

			SessionFactory sf = HibernateUtil.getseSessionFactory();
			Session session = sf.openSession();
			org.hibernate.Transaction tx = session.beginTransaction();

			String cous[] = { "Java", "JDBC", "JSP" };

			List<String> ems = new ArrayList<String>();
			ems.add("aa@jlc");
			ems.add("bb@jlc");
			ems.add("cc@jlc");

			List<Integer> maks = new ArrayList<Integer>();
			maks.add(new Integer(100));
			maks.add(new Integer(99));
			maks.add(new Integer(100));

			Set<Long> phs = new HashSet<Long>();
			phs.add(new Long(1111));
			phs.add(new Long(2222));
			phs.add(new Long(3333));

			Map<String, Long> refs = new HashMap<String, Long>();
			refs.put("aaa", new Long(1111));
			refs.put("aaa", new Long(2222));
			refs.put("aaa", new Long(3333));

			Student stu = new Student("sri", "10-10-10", "M.Sc", cous, ems,
					maks, phs, refs);
			session.save(stu);
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
