package com.rui.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ds")
public class DemoServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletOutputStream sos = resp.getOutputStream();
		FileInputStream fi = new FileInputStream(new File(getServletContext().getRealPath("images"), "a.jpg"));
		int index = -1;
		while((index = fi.read()) != -1) {
			sos.write(index);
		}
		
	}
}
