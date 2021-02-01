package com.rui.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
/**
 * 环绕通知
 * @author Rui
 * Date 2021年1月29日 下午5:09:57
 */
public class MyAround implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
			System.out.println("环绕-前置");
			Object result = arg0.proceed();
			System.out.println("环绕-后置");
			return result;
	}

}
