package com.jlcindia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Lab27 {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.transfer(77, 88, 5000);

	}
}

@SuppressWarnings("serial")
class InsufficientFundsException extends Exception {
	InsufficientFundsException() {
	}

	@Override
	public String toString() {
		return "Sufficient Funds are Not Available";
	}
}

@SuppressWarnings("serial")
class InvalidAccountNumberException extends Exception {
	int accno;

	InvalidAccountNumberException() {
	}

	InvalidAccountNumberException(int accno) {
		this.accno = accno;

	}

	@Override
	public String toString() {
		return "Accno :" + accno + " is Not Found";
	}
}

class Account {
	int bal;
	int dabal, sabal, danbal, sanbal;

	public void transfer(int sa, int da, int amt) {
		Connection con = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		try {
			con = JDBCUtil.getMySQLConnection();
			
			
			// Starting Transaction
			con.setAutoCommit(false);

			
			// Operation 1 check destination account
			ps1 = con.prepareStatement("select bal from account whre accno=?");
			ps1.setInt(1, da);
			ResultSet rs1 = ps1.executeQuery();
			if (rs1.next())
				dabal = rs1.getInt(1);
			else
				throw new InvalidAccountNumberException(da);
			danbal = dabal + amt;

			
			// Operation 2 Updating destination account
			ps2 = con
					.prepareStatement("update account set bal=? where accno=?");
			ps2.setInt(1, danbal);
			ps2.setInt(2, da);
			ps2.executeUpdate();
			System.out.println("** " + da + " Updated");

			
			// Operation 3 Checking Source Account
			ps1.setInt(1, sa);
			rs1 = ps1.executeQuery();
			if (rs1.next()) {
				sabal = rs1.getInt(1);
			} else {
				throw new InvalidAccountNumberException(sa);
			}
			if (sabal >= amt) {
				sanbal = sabal - amt;
			} else {
				new InsufficientFundsException();
			}

			// Operation 4 Updating Source Account
			ps2.setInt(1, sanbal);
			ps2.setInt(2, sa);
			ps2.executeUpdate();
			con.commit();
			System.out.println("** " + sa + " Updated");
			System.out.println("**Fund Transfered");

		} catch (Exception e) {
			System.out.println(e);
			try {
				con.rollback();
			} catch (Exception e1) {
			}

		} finally {
			JDBCUtil.cleanup(ps1, con);
			JDBCUtil.cleanup(ps2, con);
		}
	}
}
