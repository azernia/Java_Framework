package com.rui.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.rui.pojo.Student;
import com.rui.util.MyBatisUtil;

/**
 * 使用ResultType标签
 * @author Rui
 * Date 2021年1月28日 上午8:57:38
 */
public class Test {
	public static void main(String[] args) {
		SqlSession session = MyBatisUtil.getSession();
		List<Student> list = session.selectList("com.rui.mapper.StudentMapper.selAll");
//		List<Teacher> list = session.selectList("com.rui.mapper.TeacherMapper.selAll1");
		System.out.println(list);
		session.close();
	}
}
