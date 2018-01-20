package com.jlcindia.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab41 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				JLCConfig.class);
		TestBean tb = (TestBean) ctx.getBean("testBean");
		tb.showEnglish();
		tb.showHindi();

	}

}
