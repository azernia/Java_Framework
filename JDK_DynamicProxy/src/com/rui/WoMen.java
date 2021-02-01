package com.rui;

import java.lang.reflect.Proxy;

public class WoMen {
	public static void main(String[] args) {
		System.out.println(WoMen.class.getClassLoader() == LaoZong.class.getClassLoader());
		MiShu mishu = new MiShu();
		/*
		 * param1 反射时使用的类加载器
		 * param2 Proxy需要实现的什么接口
		 * param3 通过接口对象调用方法时,需要调用哪个类的invoke方法
		 */
		GongNeng gn = (GongNeng) Proxy.newProxyInstance(WoMen.class.getClassLoader(), new Class[] {GongNeng.class}, mishu);
		gn.chifan();
	}
}
