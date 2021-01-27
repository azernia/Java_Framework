package com.rui.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.rui.pojo.People;

public class Test {
	public static void main(String[] args) {
		try {
			InputStream is = Resources.getResourceAsStream("mybatis.xml");
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = factory.openSession();
			/*
			 * List<People> list = session.selectList("com.rui.mapper.PeopleMapper.selAll");
			 * System.out.println(list);
			 */
			People p = (People)session.selectOne("com.rui.mapper.PeopleMapper.selById", 2);
			System.out.println(p);
			int pageSize = 2;
			int pageNum = 1;
			Map<String,Object> map = new HashMap<>();
			map.put("pageSize", pageSize);
			map.put("pageNum", pageSize*(pageNum - 1));
			/*
			 * List<People> list = session.selectList("com.rui.mapper.PeopleMapper.page",
			 * map); System.out.println(list);
			 */
			People peo = new People();
			peo.setPname("测试新增");
			peo.setAge(888);
			try {
				int index = session.insert("com.rui.mapper.PeopleMapper.ins", peo);
				System.out.println(index);
				session.commit();
			} catch (Exception e) {
				session.rollback();
				e.printStackTrace();
			}
			session.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
