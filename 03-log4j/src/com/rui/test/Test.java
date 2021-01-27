package com.rui.test;

import org.apache.log4j.Logger;

public class Test {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Test.class);
		logger.debug("这是调试");
		logger.info("普通信息");
		try {
			int num = 5 / 0;
		} catch(Exception e) {
			logger.error(e.getMessage());
		}
	}
}
