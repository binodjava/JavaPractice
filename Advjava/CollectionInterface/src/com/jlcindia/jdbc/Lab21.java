package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

/*
Metadata:
DatabaseMetaData is used to get the information about your database i.e you can find whether database is supporting the
required features or not
*/
public class Lab21 {

	
	public static void main(String[] args) throws SQLException {
	Connection con=JDBCUtil.getMySQLConnection();
	DatabaseMetaData md=con.getMetaData();
	System.out.println("URL :"+md.getURL());
	System.out.println("User :"+md.getUserName());
	System.out.println("Major Version :"+md.getDatabaseMajorVersion());
	System.out.println("Minor Version :"+md.getDatabaseMinorVersion());
	System.out.println("Full Join :"+md.supportsFullOuterJoins());
	System.out.println("Product Name :"+md.getDatabaseProductName());
	System.out.println("Multiple RS :"+md.supportsMultipleOpenResults());
	System.out.println("DB :"+md.getDatabaseProductName());
	System.out.println("DB :"+md.getDatabaseProductVersion());
	}
}
