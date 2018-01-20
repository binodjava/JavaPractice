package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Lab6 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st = null;
		try{
			con=JDBCUtil.getMySQLConnection();
			//con=JDBCUtil.getOracleConnection();
			String qry="insert into jlcstudents values(66,'dande','dande@jlc.com',99887766)";
			st=con.createStatement();
			int x=st.executeUpdate(qry);
			if(x==1)
				System.out.println("Record inserted");
			else
				System.out.println("Record not inserted");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(st, con);
		}

	}
}
