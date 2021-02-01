package com.rui.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*
		 * String[] str = ac.getBeanDefinitionNames(); for (String string : str) {
		 * System.out.println(string); }
		 */
		Demo demo = ac.getBean("demo", Demo.class);
		try {
			demo.demo1();
		} catch (Exception e) {
//			e.printStackTrace();
		}
	}
}
