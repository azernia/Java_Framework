package com.rui.service;

import java.util.List;

import com.rui.pojo.Flower;
/**
 * 显示所有花卉信息
 * @author Rui
 * Date 2021年1月26日 上午8:56:55
 */
public interface FlowerService {
	List<Flower> selAll();
	
	int insFlower(Flower f);
}
