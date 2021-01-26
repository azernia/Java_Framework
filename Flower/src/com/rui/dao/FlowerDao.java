package com.rui.dao;

import java.util.List;

import com.rui.pojo.Flower;

public interface FlowerDao {
	/**
	 * 查询全部
	 * @return
	 */
	List<Flower> selAll();
	/**
	 * 添加花卉信息
	 * @param f 花卉对象
	 * @return 成功返回1，失败返回0
	 */
	int insFlower(Flower f);
}
