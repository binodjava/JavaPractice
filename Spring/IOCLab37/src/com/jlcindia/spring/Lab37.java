package com.jlcindia.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Lab37 {
	public static void main(String[] args) {
		ClassPathResource res = new ClassPathResource("jlcindia.xml");
		BeanFactory factory = new XmlBeanFactory(
				(org.springframework.core.io.Resource) res);
		System.out.println("Spring container is ready...");
		System.out.println("---------------------------");
		Hello hello = (Hello) factory.getBean("HELLO");
		hello.show();
		System.out.println("----------------------------");
		System.out.println("Spring container is going to shutdown...");

	}

}
