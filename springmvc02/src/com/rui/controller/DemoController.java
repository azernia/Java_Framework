package com.rui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	//请求映射
	@RequestMapping("demo")
	public String  demo() {
		System.out.println("执行demo");
		return "/main.jsp";
	}
}
