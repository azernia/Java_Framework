package com.rui;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MiShu implements MethodInterceptor{

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		System.out.println("预约时间");
		Object result = arg3.invokeSuper(arg0, arg2);
		return result;
	}
	

}
