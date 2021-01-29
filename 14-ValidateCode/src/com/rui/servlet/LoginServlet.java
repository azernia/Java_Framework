package com.rui.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.rui.pojo.User;
import com.rui.service.UserService;
import com.rui.service.impl.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	@Override
	public void init() throws ServletException {
		ApplicationContext ac  = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		userService=ac.getBean("userService",UserServiceImpl.class);
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String code = req.getParameter("code");
		String codeSession = req.getSession().getAttribute("code").toString();
		if(codeSession.equals(code)){
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			User u = new User();
			u.setPwd(password);
			u.setUname(username);
			User user = userService.checkLogin(u);
			if(user!=null){
				resp.sendRedirect("main.jsp");
			}else{
				req.setAttribute("error", "用户名密码不正确");
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
		}else{
			req.setAttribute("error", "验证码不正确");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
	}
}
