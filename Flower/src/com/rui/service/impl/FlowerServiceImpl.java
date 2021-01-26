package com.rui.service.impl;

import java.util.List;

import com.rui.dao.FlowerDao;
import com.rui.dao.impl.FlowerDaoImpl;
import com.rui.pojo.Flower;
import com.rui.service.FlowerService;

public class FlowerServiceImpl implements FlowerService {
	private FlowerDao fd = new FlowerDaoImpl();
	@Override
	public List<Flower> selAll() {
		return fd.selAll();
	}
	@Override
	public int insFlower(Flower f) {
		// TODO Auto-generated method stub
		return fd.insFlower(f);
	}

}
