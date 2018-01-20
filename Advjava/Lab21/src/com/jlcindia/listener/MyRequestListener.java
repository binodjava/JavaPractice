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
 * Application Lifecycle Listener implementation class MyRequestListener
 * 
 */
public class MyRequestListener implements ServletRequestListener {

	public MyRequestListener() {
		System.out.println("** MyRequestListener() Def Cons");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent event) {
		System.out.println("** requestDestroyed ");

	}

	@Override
	public void requestInitialized(ServletRequestEvent event) {
		System.out.println("** requestInitialized");

	}

}
