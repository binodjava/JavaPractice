package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		RequestDispatcher rd1 = req.getRequestDispatcher("header.html");
		rd1.include(req, res);

		RequestDispatcher rd2 = req.getRequestDispatcher("home.html");
		rd2.include(req, res);

		RequestDispatcher rd3 = req.getRequestDispatcher("footer.html");
		rd3.include(req, res);

	}

}
