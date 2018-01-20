package com.jlcindia.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab30 {

/*
create table datatable(
id int,
name varchar(100),
data longblob		
);

*/
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name with path");
		String fileName = sc.nextLine();
		String absFileName = fileName;
		StringTokenizer tok = new StringTokenizer(fileName, "\\");
		while (tok.hasMoreTokens())
			fileName = tok.nextToken();
		Connection con = null;
		PreparedStatement ps = null;
		FileInputStream fis = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "INSERT INTO datatable(name,data) values(?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, fileName);
			File image = new File(absFileName);
			fis = new FileInputStream(image);
			ps.setBinaryStream(2, fis, (int)image.length());
			ps.execute();
			System.out.println("Inserted");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(ps, con);
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
