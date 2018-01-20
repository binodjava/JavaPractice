package com.javatpoint;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;

public class Test {
	public static void main(String[] args) {

		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory b = new XmlBeanFactory(r);
		MailMail m = (MailMail) b.getBean("mailMail");
		String sender = "binod.recruiter@gmail.com";// write here sender gmail id
		String receiver = "seema.kumari17071@gmail.com";// write here receiver id
		m.sendMail(sender, receiver, "hi", "welcome");

		System.out.println("success");
	}
}