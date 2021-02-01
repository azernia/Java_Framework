package com.rui.test;

public class Demo {
	public void demo1() {
		try {
			int i = 5/0;
		} catch (Exception e) {
//			e.printStackTrace();
		}
		System.out.println("调用demo1");
	}

	public void demo2() {
		System.out.println("调用demo2");
	}

	public void demo3() {
		System.out.println("调用demo3");
	}
}
