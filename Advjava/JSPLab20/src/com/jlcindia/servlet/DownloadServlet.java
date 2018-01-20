package com.jlcindia.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadServlet
 */
public class DownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("filename");
		@SuppressWarnings("deprecation")
		String path = request.getRealPath("/");
		path = path + "WEB-INF/files";
		File dir = new File(path);
		File file = new File(dir, fname);

		String mimeType = getServletContext().getMimeType(file.getName());
		if (mimeType == null) {
			mimeType = "application/octet-stream";
		}
		response.setContentType(mimeType);
		response.setContentLength((int) file.length());
		// attachment;filename="java 7.pdf"

		if (file.getName().endsWith(".pdf")) {
			response.addHeader("Content-Disposition", "inline;filename=\""
					+ file.getName() + "\"");
		} else {
			response.addHeader("Content-Disposition", "attachment;filename=\""
					+ file.getName() + "\"");
		}

		OutputStream out = response.getOutputStream();
		FileInputStream fis = new FileInputStream(file);
		while (true) {
			int ab = fis.read();
			if (ab == -1)
				break;
			out.write(ab);
		}

	}
}
