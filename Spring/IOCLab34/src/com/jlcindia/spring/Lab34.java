package com.jlcindia.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Lab34 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		Hello h = (Hello) ctx.getBean("hello");
		h.show();

	}
}
