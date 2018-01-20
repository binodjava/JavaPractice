package com.jlcindia.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab31 {

	/*
	 * create table datatable( id int, name varchar(100), data longblob );
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name");
		String fileName = sc.nextLine();
		Connection con = null;
		PreparedStatement ps = null;
		FileOutputStream fos = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			String sql = "SELECT name,data FROM datatable where name=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, fileName);
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()) {
				File image = new File("E:\\fileName");
				fos = new FileOutputStream(image);
				byte[] buffer = new byte[1];
				InputStream is = resultSet.getBinaryStream(2);
				while (is.read(buffer) > 0) {
					fos.write(buffer);
				}
			}

			System.out.println("File Accessed in E:\\" + fileName);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.cleanup(ps, con);
			if (fos != null)
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
