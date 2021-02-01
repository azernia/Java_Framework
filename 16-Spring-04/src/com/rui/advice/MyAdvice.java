package com.rui.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect	//表示该类是通知切面类
public class MyAdvice {
	/*
	 * 	前置通知,参数为设置切点的全包路径
	 */
	@Before("com.rui.test.Demo.demo1()")
	public void beforeAdivce() {
		System.out.println("I am before advice");
	}
	/*
	 * 配置前置通知
	 */
	@After("com.rui.test.Demo.demo1()")
	public void afterAdvice() {
		System.out.println("I am after advice");
	}
	/*
	 * 配置异常通知
	 */
	@AfterThrowing("com.rui.test.Demo.demo1()")
	public void throwAdvice() {
		System.out.println("This is throw advice");
	}
	@Around("com.rui.test.Demo.demo1()")
	public Object aroundAdvice(ProceedingJoinPoint p) throws Throwable {
		System.out.println("This is around before advice");
		//放行
		Object result = p.proceed();
		System.out.println("This is around after advice");
		return result;
	}
}
