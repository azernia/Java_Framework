package com.rui.service.impl;

import com.rui.mapper.UsersMapper;
import com.rui.pojo.Users;
import com.rui.service.UsersService;

public class UsersServiceImpl implements UsersService {
	private UsersMapper um;

	public UsersMapper getUm() {
		return um;
	}

	public void setUm(UsersMapper um) {
		this.um = um;
	}

	@Override
	public Users login(Users u) {
		return um.selByUsers(u);
	}

}
