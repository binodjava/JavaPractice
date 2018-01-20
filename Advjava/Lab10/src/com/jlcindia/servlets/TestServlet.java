package com.jlcindia.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.beans.editors.EnumEditor;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// 1. Request Parameters
		String un = request.getParameter("uname");
		String pw = request.getParameter("password");

		// 2. Display request parameters
		PrintWriter out = response.getWriter();
		out.println("<h1>Username :" + un);
		out.println("<br/>Password :" + pw);
		out.println("<hr/>");
		out.println("Requrest Handlers");

		// 3. Requrest Handlers
		Enumeration e = request.getHeaderNames();
		while (e.hasMoreElements()) {
			String hn = e.nextElement().toString();
			String hv = request.getHeader(hn);
			out.println("<br/>" + hn + ":" + hv);
		}
		out.println("<hr/>");
		out.println("Locale Info");

		// 4. Locals supports by Browser
		out.println("<br/>request.getLocale():" + request.getLocale());
		out.println("<hr/>");
		out.println("Other Info");

		// 5. Other information from Request
		out.println("<br/>METHOD :" + request.getMethod());
		out.println("<br/>REQUEST URI :" + request.getRequestURI());
		out.println("<br/>REQUEST URL :" + request.getRequestURL());
		out.println("<br/>PROTOCOL :" + request.getProtocol());
		out.println("<br/>CONTENT LEN :" + request.getContentLength());
		out.println("<br/>CONTENT TYPE:" + request.getContentType());
		out.println("<br/>REMOTE ADD :" + request.getRemoteAddr());
		out.println("<br/>REMOTE PORT:" + request.getRemotePort());
		out.println("<br/>REMOTE HOST :" + request.getRemoteHost());
		out.println("<br/>SERVER PORT :" + request.getServerPort());
		out.println("<br/>SERVER NAME :" + request.getServerName());
		out.println("<br/>QUERY STRING() :" + request.getQueryString());
		out.println("<br/>request.getServletPath() :"
				+ request.getServletPath());
		out.println("<br/>request.getContextPath() :"
				+ request.getContextPath());

	}
}
