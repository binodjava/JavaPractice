package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/*
 ResultSetMetadata:
 ResultSetMetaData is used to get the information about your ResultSet Object.
 */
public class Lab22 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {

			con = JDBCUtil.getMySQLConnection();
			st = con.createStatement();
			rs = st.executeQuery("select * from jlcstudents");
			ResultSetMetaData md = rs.getMetaData();
			int cols = md.getColumnCount();
			System.out.println("Columns :" + cols);
			for (int i = 1; i <= cols; i++) {
				String colNm = md.getColumnClassName(i);
				String clsNm = md.getColumnClassName(i);
				String tabNm = md.getColumnTypeName(i);
				String tNm = md.getColumnTypeName(i);
				int size = md.getPrecision(i);
				System.out.println(colNm + "\t\t" + tabNm + "\t\t" + tNm+ "\t\t" + clsNm + "\t" + size);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(rs, st, con);
		}
	}
}
