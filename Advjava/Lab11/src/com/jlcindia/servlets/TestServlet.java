package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	static int count = 0;
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		count++;
		System.out.println("---service()---");
		Writer out = res.getWriter();
		Date dt = new Date();
		out.write("<h1>" + dt);
		if (count <= 10) {
			res.setHeader("Refresh", "1");
		} else {
			res.setHeader("Refresh", "1;URL=http://jlcindia.com");
		}

	}

}
