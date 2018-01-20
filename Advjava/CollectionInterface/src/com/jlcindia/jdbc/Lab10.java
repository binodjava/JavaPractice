package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Lab10 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getMySQLConnection();
			// con = JDBCUtil.getOracleConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Query :");
			String qry = sc.nextLine();
			st = con.createStatement();
			boolean b1 = st.execute(qry);
			if (b1) {
				rs = st.getResultSet();
				if (rs.next()) {
					do {
						int sid = rs.getInt(1);
						String nm = rs.getString(2);
						String em = rs.getString(3);
						long phn = rs.getLong(4);
						System.out.println(sid + "\t" + nm + "\t" + em + "\t"
								+ phn);
					} while (rs.next());
				}
			} else {
				int x = st.getUpdateCount();
				System.out.println("Result :" + x);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(st, con);
		}
	}
}
