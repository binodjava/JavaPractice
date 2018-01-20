package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TestServlet
 */

@WebServlet(
		name="testServlet",
		urlPatterns="/test.jlc")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("TestServlet->service()");
		System.out.println("Accessing Session Object");
		HttpSession sess = req.getSession();
		String eml = req.getParameter("email");
		ServletContext ctx = getServletContext();
		System.out.println("Storig attribute in Context");
		ctx.setAttribute("email", eml);
		System.out.println("Replacing attribute in Context");
		ctx.setAttribute("email", "nivas@jlc.com");
		System.out.println("Removing attribute in Context");
		ctx.removeAttribute("email");
		System.out.println("Invalid Session Object");
		sess.invalidate();
		Writer out = res.getWriter();
		out.write("<h1>Verify the server console");

	}

}
