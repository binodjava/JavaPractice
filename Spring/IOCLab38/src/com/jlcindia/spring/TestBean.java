package com.jlcindia.spring;

import javax.annotation.Resource;

public class TestBean {
	@Resource(name = "oracleDS")
	DataSource oracleDataSource;

	@Resource(name = "mysqlIDS")
	DataSource mysqlDataSource;

	public void show() {
		System.out.println(oracleDataSource);
		System.out.println(mysqlDataSource);
	}
}
