package com.rui.test;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 * 	加上@Component注解后默认该类首字母变小写,可通过参改变
 * 	@Component("自定义参数")
 *  相当于bean标签
 */
@Component
public class Demo {
	/*
	 * 设置切点
	 */
	@Pointcut("execution(* com.rui.test.Demo.demo1())")
	public void demo1() {
		System.out.println("调用demo1");
		int a = 5/0;
	}
}
