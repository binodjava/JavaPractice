/*package com.jlcindia.jdbc;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.sql.*;
import javax.sql.rowset.JdbcRowSet;

import com.sun.rowset.JdbcRowSetImpl;





public class Lab24 {

	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			RowSet rs=JdbcRowSetImpl();
			//RowSet rs=new CachedRowSetImpl();
			rs.setUrl("jdbc:mysql://localhost:3306/jlcdb");
			rs.setUsername("root");
			rs.setPassword("password");
			rs.setCommand("select sid,sname,email,phone from jlcstudents");
			rs.execute();
			while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
			}
			rs.absolute(2);
			rs.updateString(2, "Dande");
			rs.updateString(3, "dande@jlc.com");
			rs.updateLong(4, 31903290);
			rs.updateRow();
			System.out.println("Updated");
			rs.beforeFirst();
			System.out.println("Serializing JdbcRowSet");
			FileOutputStream fos=new FileOutputStream("E:\\rowset.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(rs);
			System.out.println("Serialized");
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}
*/