package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getMySQLConnection();
			// con = JDBCUtil.getOracleConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter sid :");
			int sid = sc.nextInt();
			String qry = String.format(
					"select * from jlcstudents where sid=%d", sid);
			st = con.createStatement();
			rs = st.executeQuery(qry);
			if (rs.next()) {
				int id = rs.getInt(1);
				String nm = rs.getString(2);
				String eml = rs.getString(3);
				long phn = rs.getLong(4);
				System.out.println(id + "\t" + nm + "\t" + eml + "\t" + phn);
			} else
				System.out.println("Sorry, Student not found");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(st, con);
		}
	}
}
