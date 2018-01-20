package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig cfg = null;

	@Override
	public void init(ServletConfig cfg) throws ServletException {
		this.cfg = cfg;
		System.out.println("** init() methos of HelloServlet**");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("** service() method of HelloServlet**");
		String fnm = req.getParameter("fnm");
		String phn = req.getParameter("phone");
		Writer out = res.getWriter();
		res.setContentType("text/html");
		out.write("<h1> Response from HelloServlet ");
		out.write("<hr/> Request Parameters");
		out.write("<br/>Fname :" + fnm);
		out.write("<br/>Phone :" + phn);
		out.write("<hr/>Servlet Config Parameters");
		String eml = cfg.getInitParameter("email");
		out.write("<br/>Email :" + eml);
		out.write("<hr/>Servlet Context Parameters");
		ServletContext ctx = cfg.getServletContext();
		String web = ctx.getInitParameter("website");
		out.write("<br/>" + ctx);
		out.write("<br/> :" + web);

	}

}
