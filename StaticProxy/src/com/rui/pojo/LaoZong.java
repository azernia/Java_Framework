package com.rui.pojo;

public class LaoZong implements GongNeng {
	private String name;

	public LaoZong() {
		super();
	}

	public LaoZong(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void zhiDingXiaoMuBiao() {
		System.out.println("制定小目标");
	}
}
