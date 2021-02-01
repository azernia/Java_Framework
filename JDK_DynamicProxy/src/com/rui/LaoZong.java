package com.rui;

public class LaoZong implements GongNeng {
	
	private String name;

	public LaoZong(String name) {
		super();
		this.name = name;
	}

	@Override
	public void chifan() {
		System.out.println("吃饭");
	}

	@Override
	public void mubiao() {
		System.out.println("目标");
	}

}
