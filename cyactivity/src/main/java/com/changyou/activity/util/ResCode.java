package com.changyou.activity.util;

import com.cyou.common.parent.consts.EnumIntf;

public enum ResCode implements EnumIntf {

	
	ResCode20011(20011, "已参与过该活动"),
	ResCode20012(20012, "礼包码已用完"),
	ResCode20013(20013, "礼包码获取失败，请重新提交"),
	ResCode20015(20015, "活动未开始"),
	ResCode20016(20016, "活动已结束"),
	ResCode20018(20018, "未达到领取条件"),
	

	ResCode20020(20020, "缺少参数"),

	
	ResCode20003(20003, "修改失败"),
	ResCode20002(20002, "保存失败"),
	ResCode20001(20001, "失败"),
	ResCode20000(10000, "成功");
	
	
    private int num;
    private String title;

    private ResCode(int num, String title) {
        this.num = num;
        this.title = title;
    }
    
	@Override
	public int getCode() {
		return this.num;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public boolean is(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}


}
