package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab35 {

	public static void main(String[] args) throws ClassNotFoundException {

		//Class.forName("com.mysql.jdbc.Driver");
		String URL = "jdbc:mysql://localhost:3306/jlcdb";
		String UNAME = "root";
		String PWORD = "password";
		try {
			Connection con = DriverManager.getConnection(URL, UNAME, PWORD);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from jlcstudents");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
 * without register driver we are calling connection method
 * so first we should load the driver and then have to call.
 * solution is 	//Class.forName("com.mysql.jdbc.Driver");
 */



