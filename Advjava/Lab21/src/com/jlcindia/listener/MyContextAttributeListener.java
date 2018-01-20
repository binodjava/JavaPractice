package com.jlcindia.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class
 * MyContextAttributeListener
 * 
 */
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
