package com.rui.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rui.pojo.Menu;
import com.rui.service.MenuService;

@Controller
public class MenuController {
	//默认通过byName查找
	@Resource
	private MenuService menuServiceImpl;
	
	@RequestMapping("show")
	@ResponseBody
	public List<Menu> show() {
		return menuServiceImpl.show();
	}
}
