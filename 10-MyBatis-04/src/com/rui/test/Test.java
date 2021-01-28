package com.rui.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.rui.pojo.Log;
import com.rui.util.MyBatisUtil;

public class Test {
	public static void main(String[] args) {
		SqlSession session = MyBatisUtil.getSession();
		List<Log> list = session.selectList("selAll");
		session.close();
	}
}
