package com.changyou.activity.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.changyou.activity.bean.ResultConfigEntity;
import com.changyou.activity.dao.ResultConfigMapper;
import com.cyou.common.datasource.service.SuperService;

@Service
public class ResultConfigService extends SuperService<ResultConfigMapper, ResultConfigEntity> {

    
    
    public Map<String, Object> findLover(String birthday, int sex){
    	Map<String, Object> node = new HashMap<>();
        List<ResultConfigEntity> list = baseMapper.findAll();
        for (ResultConfigEntity rsConfig : list) {
        	String[] startStr = rsConfig.getStartDate().split("[.]");
			String startM = startStr[0];
			String startD = startStr[1];
        	String[] endStr = rsConfig.getEndDate().split("[.]");
			String endM = endStr[0];
			String endD = endStr[1];
        	String[] curStr = birthday.split("[.]");
			String curM = curStr[0];
			String curD = curStr[1];
			if(Integer.valueOf(startM) == Integer.valueOf(curM) && Integer.valueOf(curD) >= Integer.valueOf(startD)
					|| Integer.valueOf(endM) == Integer.valueOf(curM) && Integer.valueOf(curD) <= Integer.valueOf(endD)) {
				if(sex == 0) {
					node.put("name", rsConfig.getName2());
					node.put("code", rsConfig.getCode2());
				}else {
					node.put("name", rsConfig.getName1());
					node.put("code", rsConfig.getCode1());
				}
			}
		}
        return node;
    }
    
}
