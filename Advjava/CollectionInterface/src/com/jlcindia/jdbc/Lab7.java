package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab7 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			// con=JDBCUtil.getOracleConnection();
			String qry = "select * from jlcstudents";
			st = con.createStatement();
			rs = st.executeQuery(qry);
			if (rs.next())
				do {
					int sid = rs.getInt(1);
					String nm = rs.getString(2);
					String eml = rs.getString(3);
					long phn = rs.getLong(4);
					System.out.println(sid + "\t" + nm + "\t" + eml + "\t"+ phn);
				} while (rs.next());
			else
				System.out.println("No recorded found");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(rs, st, con);
		}

	}
}
