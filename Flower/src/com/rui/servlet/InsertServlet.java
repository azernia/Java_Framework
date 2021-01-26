package com.rui.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rui.pojo.Flower;
import com.rui.service.FlowerService;
import com.rui.service.impl.FlowerServiceImpl;

@WebServlet("/is")
public class InsertServlet extends HttpServlet {
	private FlowerService fs = new FlowerServiceImpl();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String fname = req.getParameter("fname");
		double price = Double.parseDouble(req.getParameter("price"));
		String production = req.getParameter("production");
		Flower f = new Flower(0, fname, price, production);
		int index = fs.insFlower(f);
		if(index > 0) {
			resp.sendRedirect("fs");
//			req.getRequestDispatcher("fs").forward(req, resp);
		} else {
			resp.sendRedirect("index.jsp");
//			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
