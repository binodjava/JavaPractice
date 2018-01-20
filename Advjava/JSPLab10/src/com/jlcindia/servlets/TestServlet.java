package com.jlcindia.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jlcindia.beans.Account;
import com.jlcindia.beans.Address;
import com.jlcindia.beans.Customer;
import com.sun.accessibility.internal.resources.accessibility;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		HttpSession sess = req.getSession();
		ServletContext ctx = sess.getServletContext();

		// 1. String, Wrappers and Date:
		req.setAttribute("EM", "sri@jlc.com");
		sess.setAttribute("PH", new Long(123456));
		ctx.setAttribute("DOB", new Date());

		// 2. Collection of Strings, Wrappers and Date.
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(new Integer(11));
		al.add(new Integer(22));
		al.add(new Integer(33));
		al.add(new Integer(44));
		al.add(new Integer(55));
		req.setAttribute("AL", al);
		String str[] = { "dd", "ss", "jlc", "sri" };
		sess.setAttribute("STR", str);

		// 3. Collection of Collections(*JSTL)
		ArrayList<ArrayList> al1 = new ArrayList<ArrayList>();
		al1.add(al);
		al1.add(al);
		al1.add(al);
		req.setAttribute("AL1", al1);

		// 4.Customer or User defined class object
		Address add = new Address("H.M.T Main Rd", "Blore");
		Account acc = new Account(101, "SA", 9999.9, add);
		Customer cust = null;
		sess.setAttribute("CUST", cust);

		// 5.Collection of User defined class object
		ArrayList<Customer> cs = new ArrayList<Customer>();
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		cs.add(cust);
		sess.setAttribute("CS", cs);

		// 6.Map Object
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("sid", "11");
		hm.put("sname", "sri");
		hm.put("email", "sri@jlc.com");
		sess.setAttribute("HM", hm);

		// 7.Collection of Map Object(*JSTL)
		ArrayList<HashMap> al2 = new ArrayList<HashMap>();
		al2.add(hm);
		al2.add(hm);
		al2.add(hm);
		req.setAttribute("AL2", al2);
		RequestDispatcher rd = req.getRequestDispatcher("jstlshow.jsp");
		rd.forward(req, res);

	}

}
