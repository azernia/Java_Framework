package com.rui;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MiShu implements InvocationHandler {
	private LaoZong laozong = new LaoZong("yunyun");;
	
	public LaoZong getLaozong() {
		return laozong;
	}

	public void setLaozong(LaoZong laozong) {
		this.laozong = laozong;
	}

	/**
	 * param1 代理对象
	 * param2
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("预约时间");
		Object result = method.invoke(laozong, args);
		System.out.println("记录访客信息");
		return result;
	}

}
