package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Lab11 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			// con=JDBCUtil.getOracleConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter sid :");
			int sid = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name :");
			String nm = sc.nextLine();
			System.out.println("Enter Email :");
			String em = sc.nextLine();
			System.out.println("Enter Phone :");
			long phn = sc.nextLong();
			String qry = "insert into jlcstudents values (?,?,?,?)";
			ps.setInt(1, sid);
			ps.setString(2, nm);
			ps.setString(3, em);
			ps.setLong(4, phn);
			int x = ps.executeUpdate();
			if (x == 1)
				System.out.println("Record inserted successfully");
			else
				System.out.println("No record found");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(ps, con);
		}
	}
}
