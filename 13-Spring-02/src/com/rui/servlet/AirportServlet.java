package com.rui.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.rui.service.AirportService;
import com.rui.service.impl.AirportServiceImpl;

@WebServlet("/as")
public class AirportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AirportService as;

	@Override
	public void init() throws ServletException {
		ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		as = ac.getBean("airportService", AirportServiceImpl.class);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("list", as.showAll());
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
