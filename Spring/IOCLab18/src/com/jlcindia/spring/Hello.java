package com.jlcindia.spring;

public class Hello {
	private A aobj;
	private B bobj;

	public Hello() {
		System.out.println("Hello->()");
	}

	public void show() {
		System.out.println(aobj);
		System.out.println(bobj);
	}

}
