package com.rui.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rui.pojo.People;

/**
 * Spring创建对象的三种方式
 * 1.通过构造方法构造
 * 2.实例工厂
 * 3.静态工厂
 * @author Rui
 * Date 2021年1月28日 下午3:42:07
 */
public class Test2 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//实例工厂
		//People people = ac.getBean("peo1", People.class);
		//静态工厂
		//People people = ac.getBean("peo2", People.class);
		People people = ac.getBean("peo3", People.class);
		System.out.println(people);
	}
}
