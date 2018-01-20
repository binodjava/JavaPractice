package com.jlcindia.spring;

import javax.annotation.PostConstruct;

public class B {
	private int b;
	private String str;
	static {
		System.out.println("B->S.B");
	}

	public B() {
		System.out.println("B->()");
	}

	public B(int b, String str) {
		System.out.println("N-(int,String)");
		this.b = b;
		this.str = str;
	}

	@PostConstruct
	public void init() {
		System.out.println("B->init()");
	}

	@Override
	public String toString() {
		return "" + b + "\t" + str;
	}
}
