package com.jlcindia.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab33 {
	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				HelloConfig.class);
		System.out.println("Now Spring Container is ready to use...");
		Hello hello = (Hello) ctx.getBean(Hello.class);
		hello.show();
		Hai hai = (Hai) ctx.getBean(Hai.class);
		hai.show();
	}

}
