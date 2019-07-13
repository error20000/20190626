package com.changyou.activity.service;

import org.springframework.stereotype.Service;

import com.changyou.activity.bean.ActiveConfigEntity;
import com.changyou.activity.dao.ActiveConfigMapper;
import com.cyou.common.datasource.service.SuperService;

@Service
public class ActiveConfigService extends SuperService<ActiveConfigMapper, ActiveConfigEntity> {

    
    public ActiveConfigEntity findOne(){
        return baseMapper.findOne();
    }
    
    
}
