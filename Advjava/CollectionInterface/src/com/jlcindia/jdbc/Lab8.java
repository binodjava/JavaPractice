package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Lab8 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			//con = JDBCUtil.getOracleConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter sid :");
			int sid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name: ");
			String nm = sc.nextLine();
			System.out.println("Enter Email");
			String em = sc.nextLine();
			System.out.println("Enter Phone");
			long phn = sc.nextLong();
			String qry = String.format("insert into jlcstudents values (%d,'%s','%s',%d)", sid, nm,em, phn);
			System.out.println(qry);
			st = con.createStatement();
			int x = st.executeUpdate(qry);
			if (x == 1)
				System.out.println("Record inserted successfully");
			else
				System.out.println("No Record Found");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(st, con);
		}
	}
}
