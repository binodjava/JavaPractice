package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class Lab17 {

	public static void main(String[] args) {
		Connection con = null;
		Statement st=null;
		try {
			con=JDBCUtil.getMySQLConnection();
			st=con.createStatement();
			String s1="insert into jlcstudents values(99,'sri','sri@jlc.com',98989899)";
			st.addBatch(s1);
			String s2="insert into jlcstudents values(88,'nivas','nivas@jlc.com',9898988)";
			st.addBatch(s2);
			String s3="insert into jlcstudents values(77,'dande','dande@jlc.com',98989877)";
			st.addBatch(s3);
			String s4="insert into jlcstudents values(66,'vas','vas@jlc.com',98989866)";
			st.addBatch(s4);
			String s5="update jlcstudents set phone=31903290,email='vas@gmail.com'";
			st.addBatch(s5);
			String s6="delete from jlcstudents where sid=99";
			st.addBatch(s6);
			int x[]=st.executeBatch();
			for(int i=0;i<x.length;i++)
				System.out.println(x[i]);
			
			

		} catch (Exception e) {
			System.out.println("Error in calling Procedure");
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(st,con);
		}
	}
}
