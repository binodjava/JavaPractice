package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Lab14 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			// con=JDBCUtil.getOracleConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Query :");
			String qry = sc.nextLine();
			ps = (PreparedStatement) con.prepareStatement(qry);
			boolean b1 = ps.execute();
			if (b1) {
				rs = ps.getResultSet();
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
				int x = ps.getUpdateCount();
				System.out.println("Result :" + x);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
		}
	}
}
