package com.jlcindia.jdbc;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class Lab36 {

	public static void main(String[] args) {
		try {

			RowSetFactory factory = RowSetProvider.newFactory();
			CachedRowSet rs = factory.createCachedRowSet();
			rs.setUrl("jdbc:mysql://localhost:3306/jlcdb");
			rs.setUsername("root");
			rs.setPassword("password");
			rs.setCommand("select sid,sname,email,phone from jlcstudents");
			rs.execute();
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2)
						+ "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
