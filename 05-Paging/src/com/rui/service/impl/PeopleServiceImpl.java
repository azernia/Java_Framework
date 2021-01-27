package com.rui.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.rui.service.PeopleService;
import com.rui.util.PageInfo;

public class PeopleServiceImpl implements PeopleService {

	@Override
	public PageInfo showPage(int pageSize, int pageNum) throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		PageInfo pi = new PageInfo();
		pi.setPageNum(pageNum);
		pi.setPageSize(pageSize);
		Map<String, Integer> map = new HashMap<>();
		map.put("pageStart", pageSize*(pageNum - 1));
		map.put("pageSize", pageSize);
		pi.setList(session.selectList("com.rui.mapper.PeopleMapper.selByPage", map));
		//总条数
		long count = session.selectOne("com.rui.mapper.PeopleMapper.selCount");
		pi.setTotal(count % pageSize == 0 ? count / pageSize : count / pageSize + 1 );
		return pi;
	}

}
