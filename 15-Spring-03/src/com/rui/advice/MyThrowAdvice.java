package com.rui.advice;

import org.springframework.aop.ThrowsAdvice;

public class MyThrowAdvice{
	public void myException(Exception e) {
		System.out.println("执行异常通知,异常信息:" + e.getMessage());
	}
}
