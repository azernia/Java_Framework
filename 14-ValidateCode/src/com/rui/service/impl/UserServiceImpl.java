package com.rui.service.impl;

import com.rui.mapper.UserMapper;
import com.rui.pojo.User;
import com.rui.service.UserService;

public class UserServiceImpl implements UserService {
	private UserMapper um;
	
	public UserMapper getUm() {
		return um;
	}

	public void setUm(UserMapper um) {
		this.um = um;
	}

	@Override
	public User checkLogin(User u) {
		return um.selByUnameId(u);
	}

}
