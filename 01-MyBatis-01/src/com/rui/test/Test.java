package com.rui.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.rui.pojo.Flower;

public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		//使用工厂模式
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		//生产SqlSession
		SqlSession session = factory.openSession();
		List<Flower> list = session.selectList("com.rui.Flower.selAll");
		for(Flower f : list) {
			System.out.println(f);
		}
		//selectOne 适用于返回结果只是变量或一行数据时
		int count = (int)session.selectOne("com.rui.Flower.selOne");
		System.out.println(count);
		//把数据库某一列的值当做map的key
		Map<Object, Object> map = session.selectMap("com.rui.Flower.selMap", "fname");
		System.out.println(map);
		session.close();
	}
}
