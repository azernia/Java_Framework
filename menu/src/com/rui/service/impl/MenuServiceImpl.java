package com.rui.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rui.mapper.MenuMapper;
import com.rui.pojo.Menu;
import com.rui.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {
	@Resource
	private MenuMapper menuMapper;
	
	@Override
	public List<Menu> show() {
		return menuMapper.selByPid(0);
	}

}
