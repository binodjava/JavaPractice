package com.jlcindia.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab35 {
	public static void main(String[] args) {
		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"jlcindia.xml");
		/*
		 * AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
		 * "E:\Spring\IOCLab35\src\jlcindia.xml");
		 */

		System.out.println("Spring container is ready...");
		System.out.println("-----------------------------");
		Hello hello = (Hello) ctx.getBean("HELLO");
		hello.show();
		System.out.println("----------------------------");
		System.out.println("Spring container is going to shutdown...");
		ctx.registerShutdownHook();

	}

}
