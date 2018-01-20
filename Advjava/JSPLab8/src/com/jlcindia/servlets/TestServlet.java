package com.jlcindia.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
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
		// 1. Collect parameters
		String sn = req.getParameter("sname");
		String em = req.getParameter("email");
		String ems[] = req.getParameterValues("email");
		System.out.println(sn);
		System.out.println(em);
		for (String str : ems) {
			System.out.println(str);
		}
		// 2. Collect Headers
		String ho = req.getHeader("host");
		String re = req.getHeader("refer");
		String al = req.getHeader("accept-language");
		String ae = req.getHeader("accept-encoding");
		System.out.println(ho);
		System.out.println(re);
		System.out.println(al);
		System.out.println(ae);

		// 3. Collect Cookies
		Cookie ck[] = req.getCookies();
		for (Cookie c : ck) {
			System.out.println(c.getName() + "---" + c.getValue());
		}
		Cookie ck1 = new Cookie("email", "sri@jlc.com");
		Cookie ck2 = new Cookie("phone", "123456");
		res.addCookie(ck1);
		res.addCookie(ck2);
		RequestDispatcher rd = req.getRequestDispatcher("show.jsp");
		rd.forward(req, res);

	}

}
