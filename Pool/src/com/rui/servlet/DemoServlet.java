package com.rui.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
/**
 * JDBC Tomcat pool
 * 使用JNDI获取数据库连接池对象
 * @author Rui
 * Date 2021年1月26日 下午2:14:48
 */
@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
	Context cxt = null;
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			cxt = new InitialContext();
			DataSource ds = (DataSource)cxt.lookup("java:comp/env/test");
			Connection conn = ds.getConnection();
			resp.getWriter().write("success");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
