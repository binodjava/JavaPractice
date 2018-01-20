package com.jlcindia.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class FilterC
 */
public class FilterC implements Filter {

	@Override
	public void destroy() {
		System.out.println("FilterC destroy()");

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("FilterC doFilter() Started");
		chain.doFilter(req, res);
		System.out.println("FilterC doFilter() Completed");

	}

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterC init()");

	}

}
