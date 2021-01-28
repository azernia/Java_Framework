package com.rui.factory;

import com.rui.pojo.People;

public class PeopleFactory {
	public static People newInstance(){
		return new People(1,"测试");
	}
}
