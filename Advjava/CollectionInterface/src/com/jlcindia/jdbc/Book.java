package com.jlcindia.jdbc;

public class Book {
	String bid;
	String bname;
	String author;
	String publiccation;
	double cost;
	int edition;

	public Book() {

	}

	public Book(String bname, String author, String publication, double cost,
			int edition) {

		this.bname = bname;
		this.author = author;
		this.publiccation = publication;
		this.cost = cost;
		this.edition = edition;
	}

	public String getBid() {
		return bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubliccation() {
		return publiccation;
	}

	public void setPubliccation(String publiccation) {
		this.publiccation = publiccation;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	@Override
	public String toString() {
		return "" + bid + "\t" + bname + "\t" + author + "\t" + publiccation
				+ "\t" + cost + "\t" + edition;
	}

}
