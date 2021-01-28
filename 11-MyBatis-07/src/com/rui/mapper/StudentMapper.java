package com.rui.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.rui.pojo.Student;

public interface StudentMapper {
	@Select("select t.id `teacher.id`,t.name `teacher.name`,s.id id,s.name name,age,tid from teacher t LEFT JOIN student s on t.id=s.tid")
	List<Student> selAll();
	@Select("select * from student where tid = #{param1}")
	List<Student> selById();
}
