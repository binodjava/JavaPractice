package com.jlcindia.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab45 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				JLCConfig.class);
		ctx.start();
		JLCManager jlc = (JLCManager) ctx.getBean("jlc");
		Batch b = new Batch("B-24", "28-Apr-2010", "6.30-8.30", 150);
		jlc.addBatch(b);
		Workshop ws = new Workshop("Web Service", 5000, 99);
		jlc.addWorkshop(ws);
		jlc.createHello();
		ctx.stop();
		ctx.close();

	}

}
