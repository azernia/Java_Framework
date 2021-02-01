package com.rui.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher teacher1 = ac.getBean("teacher1", Teacher.class);
		Teacher teacher2 = ac.getBean("teacher2", Teacher.class);
		System.out.println(teacher1 == teacher2);
	}
}
