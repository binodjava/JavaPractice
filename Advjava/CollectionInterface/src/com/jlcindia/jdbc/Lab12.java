package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Lab12 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		try {
			con = JDBCUtil.getMySQLConnection();
			// con=JDBCUtil.getOracleConnection();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter sid :");
			int sid=sc.nextInt();
			String qry="select * from jlcstudents where sid=?";
			ps=(PreparedStatement) con.prepareStatement(qry);
			ps.setInt(1, sid);
			rs=ps.executeQuery();
			if(rs.next()){
				int id=rs.getInt(1);
				String nm=rs.getString(2);
				String eml=rs.getString(3);
				long phn=rs.getLong(4);
				System.out.println(id+"\t"+nm+"\t"+eml+"\t"+phn);
			}else
				System.out.println("Sorry, Student nor founda");
		

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(rs,ps, con);
		}
	}
}
