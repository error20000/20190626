package com.changyou.activity.service;

import org.springframework.stereotype.Service;

import com.changyou.activity.bean.GiftCodeEntity;
import com.changyou.activity.dao.GiftCodeMapper;
import com.cyou.common.datasource.service.SuperService;

@Service
public class GiftCodeService extends SuperService<GiftCodeMapper, GiftCodeEntity> {

    
    public GiftCodeEntity findOne(){
        return baseMapper.findOne();
    }
    
    public int used(String giftCode){
        return baseMapper.used(giftCode);
    }
    
}
