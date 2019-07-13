package com.changyou.activity.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.changyou.activity.bean.ActiveConfigEntity;
import com.changyou.activity.bean.ActiveRecordEntity;
import com.changyou.activity.bean.GiftCodeEntity;
import com.changyou.activity.dao.ActiveConfigMapper;
import com.changyou.activity.dao.ActiveRecordMapper;
import com.changyou.activity.dao.GiftCodeMapper;
import com.changyou.activity.util.ResCode;
import com.changyou.activity.util.SnowflakeIdWorker;
import com.cyou.common.datasource.service.SuperService;
import com.cyou.common.parent.bean.Result;

@Service
public class ActiveRecordService extends SuperService<ActiveRecordMapper, ActiveRecordEntity> {

    @Autowired
    private ActiveConfigMapper acMapper;
    @Autowired
    private GiftCodeMapper gcMapper;

    private static Byte lock = 'a';
    
    
    
    public ActiveRecordEntity findOne(String wxId){
        return baseMapper.findOne(wxId);
    }
    
    
    @SuppressWarnings("unchecked")
	public Result<ActiveRecordEntity> insert(ActiveRecordEntity obj){
    	//判断活动时间
    	ActiveConfigEntity config = acMapper.findOne();
		long curTime = System.currentTimeMillis();
		if(config.getStartDate().getTime() > curTime) {
			return new Result<>().setCodeAndMessage(ResCode.ResCode20015);
		}else if(config.getStartDate().getTime() < curTime) {
			return new Result<>().setCodeAndMessage(ResCode.ResCode20016);
		}
		//判断是否已参与
		ActiveRecordEntity test = findOne(obj.getWxId());
		if(test != null) {
			return new Result<>().setCodeAndMessage(ResCode.ResCode20011).setData(test);
		}
		//获取礼包码
		GiftCodeEntity giftCode = null;
		synchronized (lock) {
			giftCode = gcMapper.findOne();
			if(giftCode == null) {
				return new Result<>().setCodeAndMessage(ResCode.ResCode20012);
			}
			int gres = gcMapper.used(giftCode.getGiftCode());
			if(gres == 0) {
				return new Result<>().setCodeAndMessage(ResCode.ResCode20013);
			}
		}
		//保存
		obj.setId(SnowflakeIdWorker.generateId()+"");
		obj.setDate(new Date());
		obj.setGiftCode(giftCode.getGiftCode());
		int res = baseMapper.insert(obj);
		if(res == 0) {
			return new Result<>().setCodeAndMessage(ResCode.ResCode20002);
		}else {
			return new Result<>().setCodeAndMessage(ResCode.ResCode20000).setData(giftCode.getGiftCode());
		}
    }
    
}
