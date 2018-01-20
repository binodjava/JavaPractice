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
import javax.servlet.http.HttpSession;
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

	/**
	 * Default constructor.
	 */
	public MySessionListener() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		HttpSession sess = event.getSession();
		ServletContext ctx = sess.getServletContext();
		int tv = (int) ctx.getAttribute("TV");
		tv++;
		ctx.setAttribute("TV", tv);
		int ta = (int) ctx.getAttribute("TA");
		ta++;
		ctx.setAttribute("TA", ta);

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession sess = event.getSession();
		ServletContext ctx = sess.getServletContext();
		int ta = (int) ctx.getAttribute("TA");
		ta--;
		ctx.setAttribute("TA", ta);
	}

}
