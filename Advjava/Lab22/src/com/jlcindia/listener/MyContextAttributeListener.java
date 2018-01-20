package com.jlcindia.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class
 * MyContextAttributeListener
 * 
 */
@WebListener
public class MyContextAttributeListener implements
		ServletContextAttributeListener {

	public MyContextAttributeListener() {
		System.out.println("**MyContextAttributeListener() Def Cons");
	}

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		String nm = event.getName();
		String val = event.getValue().toString();
		System.out.println("**attributeAdded() :" + nm + "\t" + val);

	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		String nm = event.getName();
		String val = event.getValue().toString();
		System.out.println("**attributeRemoved() :" + nm + "\t" + val);

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		String nm = event.getName();
		String val = event.getValue().toString();
		System.out.println("**attributeReplaced() :" + nm + "\t" + val);

	}

}
