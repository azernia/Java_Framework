package com.rui.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.rui.mapper.LogMapper;
import com.rui.pojo.Log;


public class Test {
	public static void main(String[] args) {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = factory.openSession();
			//使用了JDK的动态代理
			//面向接口代理设计模式(必须有接口)
			/*
			 * LogMapper logMapper = session.getMapper(LogMapper.class); List<Log> list =
			 * logMapper.selAll(); List<Log> list2 = logMapper.selByAccInAccOut("1", "2");
			 * for (Log log : list2) { System.out.println(list2 ); } for (Log log : list) {
			 * System.out.println(log); }
			 */
			System.out.println("请输入转账账号");
			Scanner sc = new Scanner(System.in);
			String accOut = sc.nextLine();
			System.out.println("请输入收款账号");
			String accIn = sc.nextLine();
			LogMapper mapper = session.getMapper(LogMapper.class);
			List<Log> list = mapper.selByAccInAccOut(accIn, accOut);
			System.out.println(list);
			Log log = new Log();
			log.setId(1);
			log.setAccIn(accIn);
			log.setAccOut(accOut);
			int index = mapper.upd(log);
			System.out.println(index);
			session.commit();
			session.close();
		} catch (IOException e) { 
			e.printStackTrace();
		}
	}
}
