package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Lab2 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			// step1: Load the Driver class
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			// Step2: Establish the connection
			con = DriverManager.getConnection("jdbc:odbc:JLCMYDSN","root","password");
			// Step3: Prepare the SQL connection
			String sql = "insert into jlcstudents values(89,'vas','vas@jlc',9066800)";
			// Step4: Create the JDBC statement
			st = con.createStatement();
			// Step5: Submit the SQL statement to Database using JDBC statements
			int x = st.executeUpdate(sql);
			// Step6: Process the result
			if (x == 1) {
				System.out.println("Record inserted");
			} else {
				System.out.println("Record not inserted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Step7: Close all the resources
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
