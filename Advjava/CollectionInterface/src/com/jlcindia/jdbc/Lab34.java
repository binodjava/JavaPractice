package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.RowIdLifetime;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;
import oracle.sql.ROWID;

public class Lab34 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			DatabaseMetaData dmd = con.getMetaData();
			System.out.println(RowIdLifetime.ROWID_UNSUPPORTED);
			System.out.println(RowIdLifetime.ROWID_VALID_FOREVER);
			System.out.println(RowIdLifetime.ROWID_VALID_SESSION);
			System.out.println(RowIdLifetime.ROWID_VALID_TRANSACTION);
			System.out.println("\nRowid Lefttime :");
			System.out.println(dmd.getRowIdLifetime());
			st = con.createStatement();
			rs = st.executeQuery("selec rowid,sid,sname from jlcstudents");
			while (rs.next()) {
				RowId id = rs.getRowId("rowid");
				String rowid = new String(id.getBytes());
				System.out.println(rowid + "\t" + rs.getInt(2) + "\t"+ rs.getString(3));
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
