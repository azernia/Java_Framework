package com.rui.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rui.pojo.Airport;
import com.rui.service.impl.AirportServiceImpl;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		String[] strings = ac.getBeanDefinitionNames();
		for (String string : strings) {
			System.out.println(string);
		}
		AirportServiceImpl bean = ac.getBean("airportService", AirportServiceImpl.class);
		List<Airport> showAll = bean.showAll();
		for (Airport airport : showAll) {
			System.out.println(airport);
		}
	}
}
