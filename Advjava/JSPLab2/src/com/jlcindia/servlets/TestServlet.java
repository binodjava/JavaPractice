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
		if (fnm == null || fnm.trim().length() == 0) {
			fnm = "Guest";
		}
		Date dt = new Date();
		req.setAttribute("NM", fnm);
		req.setAttribute("DT", dt);
		req.getRequestDispatcher("show.jsp").forward(req, res);

	}
}
