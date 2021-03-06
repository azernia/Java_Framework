package com.rui.pojo;

import java.util.List;

public class Teacher {
	/*
	 * private int id1; private String name1;
	 * 
	 * public int getId1() { return id1; }
	 * 
	 * public void setId1(int id1) { this.id1 = id1; }
	 * 
	 * public String getName1() { return name1; }
	 * 
	 * public void setName1(String name1) { this.name1 = name1; }
	 * 
	 * @Override public String toString() { return "Teacher [id1=" + id1 +
	 * ", name1=" + name1 + "]"; }
	 */
	
	private int id;
	private String name;
	private List<Student> stuList;
	
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", stuList=" + stuList + "]";
	}
	
}
