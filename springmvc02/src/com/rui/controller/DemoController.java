package com.rui.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rui.pojo.Demo;
import com.rui.pojo.User;

@Controller
public class DemoController {
	// 请求映射
	/*
	 * 只要给方法写参数,SpringMVC如果能获得数据就会给他赋值
	 */
	@RequestMapping("demo")
	public String demo(User u) {
		// 默认保证参数名称和请求中传递的名称相同,且参数名与对象的属性名相同
		System.out.println("执行demo" + u);
		return "/main.jsp";
	}

	@RequestMapping("demo1")
	public String demo1(@RequestParam("name1") String username, @RequestParam("age1") int age) {
		// 不对时使用该注解赋值
		return "/main.jsp";
	}

	@RequestMapping("demo2")
	public String demo2(@RequestParam(required = true) String username) {
		// required = true 必须传参数
		return "/main.jsp";
	}

	@RequestMapping("demo5")
	public String demo5(String username, int age, @RequestParam("hover") List<String> hover) {
		System.out.println(username + ":" + age + ":" + hover);
		return "/main.jsp";
	}

	@RequestMapping("page")
	public String page(@RequestParam(defaultValue = "2") int pageSize, @RequestParam(defaultValue = "1") int pageNum) {
		// defaultValue = "2" 设置默认值
		return "/main.jsp";
	};

	@RequestMapping("demo6")
	public String demo6(Demo demo) {
		// 如果传过来的参数时xxx.xxx时创建一个对象,其中的属性为该实体类并创建对应的get/set方法
		System.out.println(demo);
		return "/main.jsp";
	}
	
	@RequestMapping("demo8/{id}/{name}")
	public String demo7(@PathVariable(value = "name") String username, @PathVariable(value = "id") int age) {
		// @PathVariable获取同名占位符 {占位符} 占位符名任意即可
		System.out.println(username + " " + age);
		return "/main.jsp";
	}
	@RequestMapping("demo9")
	public String demo9() {
		//重定向
		return "redirect:/main.jsp";
	}
	@RequestMapping("demo10")
	public String demo10() {
		//自定义视图解析器不能有任何前缀,只要有前缀自定义视图解析器不生效
		return "/main.jsp";
	}
	@RequestMapping("demo11")
	@ResponseBody
	public User demo11() {
		/*
		 * @ResponseBody 将返回值转换为json字符串同时设置响应头
		 * 类型为application-json
		 */
		User u = new User();
		u.setAge(12);
		u.setUsername("张三");
		return u;
	}
	
	@RequestMapping(value="demo12",produces = "text/html;charset=utf-8")
	@ResponseBody
	public String demo12() {
		/*
		 * @ResponseBody 将返回值转换为json字符串同时设置响应头
		 * 类型为application-json
		 */
		User u = new User();
		u.setAge(12);
		u.setUsername("张三");
		return "中文";
	}
}
