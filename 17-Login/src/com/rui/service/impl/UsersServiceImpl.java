package com.rui.service.impl;

import org.springframework.beans.factory.annotation.Value;

import com.rui.mapper.UsersMapper;
import com.rui.pojo.Users;
import com.rui.service.UsersService;

public class UsersServiceImpl implements UsersService {
	@Value("${my.demo}")
	private String test;
	@Value("${my.demo1}")
	private int test1;
	
	private UsersMapper um;

	public UsersMapper getUm() {
		return um;
	}

	public void setUm(UsersMapper um) {
		this.um = um;
	}

	@Override
	public Users login(Users u) {
		System.out.println("输出:"+test+"  "+test1);
		return um.selByUsers(u);
	}

}
