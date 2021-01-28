package com.rui.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rui.pojo.People;

public class Test {
	public static void main(String[] args) {
		//测试时加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		People people = ac.getBean("peo", People.class);
		System.out.println(people);
		//所有Spring中所管理的类的名字
		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
		for (String string : beanDefinitionNames) {
			System.out.println(string);
		}
	}
}
