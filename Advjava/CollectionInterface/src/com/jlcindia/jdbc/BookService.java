package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 create table jlcbooks(
 bid char(4) primary key,
 bname varchar(20),
 author varchar(20),
 publication varchar(20),
 cost double,
 edition int
 );               


 create table users_table(
 username varchar(20) unique,
 password varchar(20)
 );

 */

public class BookService {

	public boolean verifyUser(String un, String pw) {
		boolean valid = false;
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement("select * from users_table where username=? and password=?");
			ps.setString(1, un);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			if (rs.next())
				valid = true;

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
		}
		return valid;
	}

	public int deleteBook(String bid) {
		int x = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement("delete from jlcbooks where bid=?");
			ps.setString(1, bid);
			x = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(ps, con);
		}
		return x;
	}

	public boolean addBook(Book bo) {
		boolean added = false;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement("insert into jlcbooks values(?,?,?,?,?,?)");
			ps.setString(1, getNewBookId());
			ps.setString(2, bo.getBname());
			ps.setString(3, bo.getAuthor());
			ps.setString(4, bo.getPubliccation());
			ps.setDouble(5, bo.getCost());
			ps.setInt(6, bo.getEdition());
			added = true;

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(ps, con);
		}

		return added;
	}

	public int updateBook(Book bo) {
		int x = 0;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement("update jlcbooks set bname=?,author=?,publication=?,cost=?,edition=? where bid=?");
			ps.setString(1, bo.getBname());
			ps.setString(2, bo.getAuthor());
			ps.setString(3, bo.getPubliccation());
			ps.setDouble(4, bo.getCost());
			ps.setInt(5, bo.getEdition());
			ps.setString(6, bo.getBid());
			x = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(ps, con);
		}

		return x;
	}

	public Book getBookByBid(String bid) {
		Book bo = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement("select * from jlcbooks where bid=?");
			ps.setString(1, bid);
			rs = ps.executeQuery();
			if (rs.next()) {
				bo = getBookFromResultSet(rs);
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
		}

		return bo;
	}

	public List<Book> getBookByBname(String bname) {
		List<Book> al = new ArrayList<Book>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement("select * from jlcbooks where bname=?");
			ps.setString(1, bname);
			rs = ps.executeQuery();
			while (rs.next()) {
				Book bo = getBookFromResultSet(rs);
				al.add(bo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
			;
		}

		return al;
	}

	public List<Book> getBookByAuthor(String author) {
		List<Book> al = new ArrayList<Book>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement("select * from jlcbooks where author=?");
			ps.setString(1, author);
			rs = ps.executeQuery();
			while (rs.next()) {
				Book bo = getBookFromResultSet(rs);
				al.add(bo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
			;
		}

		return al;

	}

	public List<Book> getBookByCost(double cost) {
		List<Book> al = new ArrayList<Book>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement("select * from jlcbooks where cost=?");
			ps.setDouble(1, cost);
			rs = ps.executeQuery();
			while (rs.next()) {
				Book bo = getBookFromResultSet(rs);
				al.add(bo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
			;
		}

		return al;

	}

	public List<Book> getAllBooks(String author) {
		List<Book> al = new ArrayList<Book>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement("select * from jlcbooks");
			ps.setString(1, author);
			rs = ps.executeQuery();
			while (rs.next()) {
				Book bo = getBookFromResultSet(rs);
				al.add(bo);
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
			;
		}

		return al;

	}

	private Book getBookFromResultSet(ResultSet rs) throws Exception {
		Book bo = new Book();
		bo.setBid(rs.getString(1));
		bo.setBname(rs.getString(2));
		bo.setAuthor(rs.getString(3));
		bo.setPubliccation(rs.getString(4));
		bo.setCost(rs.getDouble(5));
		bo.setEdition(rs.getInt(6));
		return bo;

	}

	private String getNewBookId() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String bid = "B-01";
		try {
			con = JDBCUtil.getMySQLConnection();
			ps = con.prepareStatement("select max(bid) from jlcbooks");
			rs = ps.executeQuery();
			if (rs.next()) {
				bid = rs.getString(1);
				if (bid != null) {
					String id = bid.substring(2);
					int x = Integer.parseInt(id);
					x++;
					if (x < 10)
						bid = "B-0" + x;
					else
						bid = "B-" + x;
				} else {
					bid = "B-01";
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.cleanup(rs, ps, con);
		}

		return bid;
	}

}
