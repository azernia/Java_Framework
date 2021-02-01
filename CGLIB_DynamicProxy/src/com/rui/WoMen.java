package com.rui;

import java.lang.reflect.Proxy;

import net.sf.cglib.proxy.Enhancer;

public class WoMen {
	public static void main(String[] args) {
		Enhancer e = new Enhancer();
		e.setSuperclass(LaoZong.class);
		e.setCallback(new MiShu());
		LaoZong laozong = (LaoZong) e.create();
		laozong.chifan();
	}
}
