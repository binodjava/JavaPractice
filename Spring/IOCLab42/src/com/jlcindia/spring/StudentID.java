package com.jlcindia.spring;

public class StudentID {
	int sid;
	String bid;

	public StudentID(int sid, String bid) {
		this.sid = sid;
		this.bid = bid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

}
