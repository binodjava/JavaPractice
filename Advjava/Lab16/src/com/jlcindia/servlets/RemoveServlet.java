package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RemoveServlet
 */
public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		String bnm = req.getParameter("bname");
		Cookie cs[] = req.getCookies();
		Writer out = res.getWriter();
		if (cs == null) {
			out.write("<h2>You are new client");
			HttpSession sess = req.getSession();
		} else {
			boolean found = false;
			for (Cookie c : cs) {
				String nm = c.getName();
				String val = c.getValue();
				if (nm.equals("JESSIONID")) {
					found = true;
					out.write("<h2>" + nm + " : " + val);
				} else if (nm.equals(bnm)) {
					c.setMaxAge(0);
					res.addCookie(c);
				} else {
					out.write("<h2>" + nm + " : " + val);
				}
				if (found) {
					out.write("<h2>You are old client");
				} else {
					out.write("<h2>You are new client");
					HttpSession sess = req.getSession();

				}
			}
			out.write("<hr/>");
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, res);
		}

	}
}
