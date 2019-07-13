package com.changyou.activity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.changyou.activity.bean.ResultConfigEntity;
import com.cyou.common.datasource.mapper.SuperMapper;

@Mapper
public interface ResultConfigMapper extends SuperMapper<ResultConfigEntity> {

    @Select("select * from ds_result_config")
    List<ResultConfigEntity> findAll();
}
