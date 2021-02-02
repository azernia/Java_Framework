package com.rui.service;

import java.util.List;

import com.rui.pojo.Files;
import com.rui.pojo.Users;

public interface FilesService {
	/**
	 * 显示全部
	 * @return
	 */
	List<Files> show();
	/**
	 * 根据id修改资料下载次数
	 * @param id
	 * @return
	 */
	int updCount(int id,Users users,String name);
}
