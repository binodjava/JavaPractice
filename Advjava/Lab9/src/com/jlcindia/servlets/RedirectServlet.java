package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectServlet
 */
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String page = req.getParameter("page");
		if (page == null || page.trim().length() == 0) {
			RequestDispatcher rd = null;
			rd = req.getRequestDispatcher("error.html");
			rd.forward(req, res);
			return;
		}
		if (page.startsWith("www")) {
			page = "http://" + page;
		}
		res.sendRedirect(page);

	}

}
