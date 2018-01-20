package com.jlcindia.listener;

import javax.servlet.ServletContext;
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
 * Application Lifecycle Listener implementation class MyContextListener
 * 
 */
public class MyContextListener implements ServletContextListener {

	public MyContextListener() {
		System.out.println("** MyContextListener() Def Cons");
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		ServletContext ctx = event.getServletContext();
		System.out.println("**contextDestroyed :" + ctx);

	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		ServletContext ctx = event.getServletContext();
		System.out.println("**contextInitialized :" + ctx);

	}

}
