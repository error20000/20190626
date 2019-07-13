package com.changyou.activity.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.changyou.activity.bean.ActiveConfigEntity;
import com.cyou.common.datasource.mapper.SuperMapper;

@Mapper
public interface ActiveConfigMapper extends SuperMapper<ActiveConfigEntity> {

    @Select("select * from ds_active_config")
    ActiveConfigEntity findOne();
}
