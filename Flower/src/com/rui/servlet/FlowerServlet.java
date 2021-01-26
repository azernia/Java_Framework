package com.rui.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rui.pojo.Flower;
import com.rui.service.FlowerService;
import com.rui.service.impl.FlowerServiceImpl;

@WebServlet("/fs")
public class FlowerServlet extends HttpServlet {
	private FlowerService fs = new FlowerServiceImpl();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Flower> list = fs.selAll();
		//作用使用原则，越小越好
		req.setAttribute("list", list);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
