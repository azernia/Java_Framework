package com.rui.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.rui.pojo.Teacher;

public interface TeacherMapper {
	@Select("select * from teacher")
	List<Teacher> selAll();
	@Insert("insert into teacher values(default,#{name})")
	int insTeacher(Teacher t);
	@Update("update teacher set name=#{name} where id = #{id}")
	int updTeacher(Teacher t);
	@Results(value = {
			@Result(id = true, property = "id",column = "id"),
			@Result(property = "name", column="name"),
			@Result(property = "stuList",column = "id" , many= @Many(select="com.rui.mapper.StudentMapper.selById"))
	})
	@Select("select * from teacher")
	List<Teacher> selTeacher();
}
