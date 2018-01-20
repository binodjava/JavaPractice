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
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		Writer out = res.getWriter();
		String bnm = req.getParameter("bname");
		Cookie c1 = new Cookie(bnm, bnm);
		res.addCookie(c1);
		out.write("<h2>" + bnm + " : " + bnm);
		Cookie cs[] = req.getCookies();
		if (cs == null) {
			out.write("<h2> You are new client");
			HttpSession sess = req.getSession();
		} else {
			boolean found = false;
			for (Cookie c : cs) {
				String nm = c.getName();
				String val = c.getValue();
				out.write("<h2>" + nm + " : " + val);
				if (nm.equals("JSESSION"))
					found = true;

			}
			if (found) {
				out.write("<h2> You are old client");
			} else {
				out.write("<h2> You are new client");
				HttpSession sess = req.getSession();
			}
		}
		out.write("<hr/>");
		RequestDispatcher rd = req.getRequestDispatcher("index.html");
		rd.include(req, res);

	}

}
