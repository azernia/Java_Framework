package com.rui.service;

import com.rui.pojo.Users;

/**
 * 声明式事物
 * @author Rui
 * Date 2021年2月1日 下午3:39:20
 */
public interface UsersService {
	int insert(Users users);
	int insUser(Users users);
}
