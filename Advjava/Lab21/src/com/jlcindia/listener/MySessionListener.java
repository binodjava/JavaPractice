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
 * Application Lifecycle Listener implementation class MySessionListener
 * 
 */
public class MySessionListener implements HttpSessionListener {
	public MySessionListener() {

		System.out.println("** MySessionListener() Def Cons");
	}

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("** sessionCreated ");

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("** sessionDestroyed ");

	}

}
