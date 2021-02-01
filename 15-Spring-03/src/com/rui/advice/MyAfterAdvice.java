package com.rui.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class MyAfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		/*
		 * arg0: 切点方法返回值 
		 * arg1:切点方法对象 
		 * arg2:切点方法参数 
		 * arg3:切点方法所在类的对象
		 */
		System.out.println("执行后置通知");
	}

}
