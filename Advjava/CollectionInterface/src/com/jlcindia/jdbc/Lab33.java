package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class Lab33 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		OracleDataSource ods = null;
		try {
			con = DriverManager
					.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
							"system", "password");
			DatabaseMetaData dmd = con.getMetaData();
			rs = dmd.getSchemas("TABLE_CAT", "SYS%");
			System.out.println("---SCHEMA---\n");
			while (rs.next()) {
				System.out.println(rs.getString(1));
			}

		} catch (SQLException e) {
			for (Throwable ex : e)
				System.out.println(e);
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
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
