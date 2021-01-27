package com.rui.filter;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.apache.ibatis.session.SqlSession;

import com.rui.util.MyBatisUtil;
@WebFilter("/*")
public class OpenSessionInView implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
//		InputStream is = Resources.getResourceAsStream("mybatis.xml");
//		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
//		SqlSession session = factory.openSession();
		SqlSession session = MyBatisUtil.getSession();
		chain.doFilter(request, response);
		try {
			session.commit();
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			MyBatisUtil.close();
		}
	}
	
}
