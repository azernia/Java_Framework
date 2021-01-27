package com.rui.service;

import java.io.IOException;

import com.rui.util.PageInfo;

public interface PeopleService {
	/**
	 * 分页显示
	 * @param pageSize 每页显示的个数
	 * @param pageNum 当前第几页
	 * @return 返回页面的信息
	 * @throws IOException 
	 */
	PageInfo showPage(int pageSize, int pageNum) throws IOException;
}
