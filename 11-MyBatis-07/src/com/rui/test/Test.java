package com.rui.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.rui.mapper.StudentMapper;
import com.rui.mapper.TeacherMapper;
import com.rui.pojo.Student;
import com.rui.pojo.Teacher;
import com.rui.util.MyBatisUtil;

/**
 * 使用ResultType标签
 * @author Rui
 * Date 2021年1月28日 上午8:57:38
 */
public class Test {
	public static void main(String[] args) {
		SqlSession session = MyBatisUtil.getSession();
		TeacherMapper tm = session.getMapper(TeacherMapper.class);
		List<Teacher> list = tm.selAll();
		System.out.println(list);
		Teacher t = new Teacher();
		t.setName("老师3");
		int index = tm.insTeacher(t);
		System.out.println(index);
		Teacher t1 = new Teacher();
		t1.setId(3);
		t1.setName("张三");
		index = tm.updTeacher(t1);
		System.out.println(index);
		StudentMapper sm = session.getMapper(StudentMapper.class);
		List<Student> list2 = sm.selAll();
		System.out.println(list2);
		session.commit();
		session.close();
	}
}
