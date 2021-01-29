package com.rui.mapper;

import org.apache.ibatis.annotations.Select;

import com.rui.pojo.User;

public interface UserMapper {
	@Select("select * from users where id = #{uname} and pwd = #{pwd}")
	User selByUnameId(User u);
}
