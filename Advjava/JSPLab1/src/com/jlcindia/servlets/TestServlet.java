package com.jlcindia.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String fnm = req.getParameter("fname");
		Date dt = new Date();
		if (fnm == null || fnm.trim().length() == 0) {
			fnm = "Guest";
		}
		String msg = "<h1>Hi " + fnm + "<br/>You have sent request on " + dt;
		res.setContentType("text/html");
		res.getWriter().write(msg);

	}

}
