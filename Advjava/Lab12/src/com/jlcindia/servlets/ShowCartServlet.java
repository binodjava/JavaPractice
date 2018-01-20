package com.jlcindia.servlets;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowCartServlet
 */
public class ShowCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		HttpSession sess = req.getSession(false);
		if (sess == null) {
			req.setAttribute("MSG", "Session is destroyed");
			RequestDispatcher rd = req.getRequestDispatcher("showbooks.jsp");
			rd.forward(req, res);
		} else {
			@SuppressWarnings("unchecked")
			Enumeration<String> enms = sess.getAttributeNames();
			List<String> selectedlist = Collections.list(enms);
			selectedlist.remove("BOOKS");
			if (selectedlist.size() == 0) {
				req.setAttribute("MSG", "No books selected");
			} else {
				req.setAttribute("CART", "selectedlist");
			}
			RequestDispatcher rd = req.getRequestDispatcher("showcart.jsp");
			rd.forward(req, res);

		}

	}

}
