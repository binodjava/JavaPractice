package com.jlcindia.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab36 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JLCConfig.class);
		

		System.out.println("Spring container is ready...");
		System.out.println("-----------------------------");
		Hello hello = (Hello) ctx.getBean("HELLO");
		hello.show();
		System.out.println("----------------------------");
		System.out.println("Spring container is going to shutdown...");
		ctx.registerShutdownHook();

	}

}
