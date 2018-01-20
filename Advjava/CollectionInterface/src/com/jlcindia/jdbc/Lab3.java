package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab3 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//MySql, what is use of ResultSet?
			con = DriverManager.getConnection("jdbc:odbc:JLCMYDSN", "root","password");
			String sql = "select * from jlcstudents";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int sid = rs.getInt(1);
				String sn = rs.getString(2);
				String em = rs.getString(3);
				long ph = rs.getLong(4);
				System.out.println(sid + "\t" + sn + "\t" + em + "\t" + "ph");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(rs!=null)
					rs.close();
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
