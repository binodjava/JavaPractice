package com.jlcindia.servlets;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.sun.corba.se.spi.ior.Writeable;

/**
 * Servlet implementation class UploadServlet
 */

@WebServlet(name = "uploadServlet", urlPatterns = { "/upload.jlc" })
@MultipartConfig(location = "D:/uploaded", fileSizeThreshold = 1024 * 1024 * 10, maxFileSize = 1024 * 1024 * 50)
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(javax.servlet.http.HttpServletRequest req,
			javax.servlet.http.HttpServletResponse res)
			throws javax.servlet.ServletException, IOException {

		Collection<Part> parts = req.getParts();
		for (Part part : parts) {
			System.out.println("Name:" + part.getName());
			System.out.println("Header:");
			for (String headerName : part.getHeaderNames()) {
				System.out.println(headerName + "\t\t"
						+ part.getHeader(headerName));
			}
			String fileinfo = part.getHeader("content-disposition");
			String fnames[] = fileinfo.split("\t");
			String fname = fnames[fnames.length - 1];
			System.out.println("Size: " + part.getSize());
			part.write(fname);
		}
		Writer out = res.getWriter();
		out.write("<h1>File uploaded to D:\\uploaded");

	}
}
