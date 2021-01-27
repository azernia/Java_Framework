package com.rui.util;

import java.util.List;
/**
 * 分页工具类
 * @author Rui
 * Date 2021年1月27日 上午9:09:17
 */
public class PageInfo {
	/**
	 * 每页显示的个数
	 */
	private int pageSize;
	/**
	 * 当前第几页
	 */
	private int pageNum;
	/**
	 * 总页数
	 */
	private long total;
	/**
	 * 当前页显示的个数
	 */
	private List<?> list;
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	
}
