package com.jlcindia.servlets;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		// 1. Collecting client data
		String unm = req.getParameter("username");
		String pwd = req.getParameter("password");
		String msg = "";

		// 2. Verifying client data
		if (unm.equals(pwd)) {
			msg = "<h1>Login Success<br/>Welcome to JLC Home Page";
		} else {
			msg = "<h1>Login Failed<br/>Invalid Username or Password";
		}

		// 3. Prepairinng the Response
		Writer writer = res.getWriter();
		writer.write(msg);

	}

}
