package com.rui.pojo;

public class MiShu implements GongNeng {
	private LaoZong laozong = new LaoZong("yunyun");

	@Override
	public void zhiDingXiaoMuBiao() {
		System.out.println("请问您要找马总吗？？");
		laozong.zhiDingXiaoMuBiao();
		System.out.println("备份访客信息");
	}
	
}
