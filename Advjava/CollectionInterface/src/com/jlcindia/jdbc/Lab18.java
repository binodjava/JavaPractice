package com.jlcindia.jdbc;

import java.sql.Connection;


import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Lab18 {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps=null;
		try {
			con=JDBCUtil.getMySQLConnection();
			String sql="insert into jlcstudents(sid,sname) values(?,?)";
			ps=(PreparedStatement) con.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			char choice='Y';
			do{
				System.out.println("Enter Name");
				String nm=sc.nextLine();
				System.out.println("Enter Id");
				int id=sc.nextInt();
				ps.setInt(1, id);
				ps.setString(2, nm);
				ps.addBatch();
				System.out.println("DO you want to add more:");
				sc.nextLine();
				choice=sc.nextLine().charAt(0);
			}while(choice=='Y');
			int res[]=ps.executeBatch();
			for(int i=0;i<res.length;i++)
				System.out.println("Res :"+res[i]);

		} catch (Exception e) {
			System.out.println("Error in calling Procedure");
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(ps,con);
		}
	}
}
