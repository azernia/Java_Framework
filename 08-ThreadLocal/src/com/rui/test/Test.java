package com.rui.test;

public class Test {
	public static void main(String[] args) {
		ThreadLocal<String> threadLocal = new ThreadLocal<>();
		threadLocal.set("测试");
		/*
		 * 创建一个子线程
		 * .start表示启动
		 * run时线程体,线程中执行的功能
		 * 匿名内部类声明要么时final要么时全局的
		 * 1. 线程容器,给线程绑定一个 Object 内容,后只要线程不变,可以随时 取出. 1.1 改变线程,无法取出内容
		 */
		new Thread() {
			public void run() {
				String str = threadLocal.get();
				System.out.println(str);
			}
		}.start();
	}
}
