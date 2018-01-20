package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab4 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Using JDBC Driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jlcdb","root", "password");
			String sql = "insert into jlcstudents values(77,'nivas','nivas@jlc',31903290)";
			st = con.createStatement();
			int x = st.executeUpdate(sql);
			if (x == 1)
				System.out.println("record inserted");
			else
				System.out.println("record not inserted");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				if (st != null)
					st.close();
				if (con != null)
					con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
