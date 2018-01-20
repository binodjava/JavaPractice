package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig sc) throws ServletException {
		System.out.println("** DemoServlet-init()");
		String ci = sc.getInitParameter("city");
		System.out.println(ci);

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("** DemoServlet-service()");
		String nm = req.getParameter("name");
		String em = req.getParameter("email");
		String ip = req.getRemoteAddr();
		String msg = "<h1>Hello !" + nm + "<br/>";
		msg = msg + "Your Email Id is " + em + "<br>";
		msg = msg + "You are sending the requesting from ip Address :" + ip;
		req.setAttribute("MSG", msg);
		PrintWriter out = res.getWriter();
		out.println(msg);

	}

	@Override
	public void destroy() {
		System.out.println("DemoServlet-destroy()");
	}
}
