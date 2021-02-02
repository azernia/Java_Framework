package com.rui.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rui.mapper.UsersMapper;
import com.rui.pojo.Users;
import com.rui.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	@Resource
	private UsersMapper usersMapper;
	@Override
	public int insRegister(Users users) {
		return usersMapper.insUsers(users);
	}
}
