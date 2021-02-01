package com.rui.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		/*
		 * arg0: 切点方法对象 Method 对象 
		 * arg1: 切点方法参数  
		 * arg2:切点在哪个对象中
		 */
		System.out.println("执行前置通知");
	}

}
