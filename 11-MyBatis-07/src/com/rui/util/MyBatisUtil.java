package com.rui.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	//factory创建耗费时间,保证有且只有一个factory
	private static SqlSessionFactory factory;
	private static ThreadLocal<SqlSession> thread = new ThreadLocal<SqlSession>();
	//静态代码块在类被加载时调用
	static {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 获取SqlSession的方法
	 * @return
	 */
	public static  SqlSession getSession() {
		SqlSession session = thread.get();
		if(session == null) {
			session = factory.openSession();
			thread.set(session);
		}
		return session; 
	}
	
	public static void close() {
		SqlSession session = thread.get();
		if(session != null) {
			session.close();
		}
		thread.set(null);
	}
}
