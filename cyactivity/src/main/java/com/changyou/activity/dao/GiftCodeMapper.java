package com.changyou.activity.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.changyou.activity.bean.GiftCodeEntity;
import com.cyou.common.datasource.mapper.SuperMapper;

@Mapper
public interface GiftCodeMapper extends SuperMapper<GiftCodeEntity> {

    @Select("select * from ds_gift_code where status = 0 order by rand() limit 1 ")
    GiftCodeEntity findOne();

    
	@Update("update ds_gift_code set status = 1 where gift_code = #{giftCode}")
	int used(String giftCode);
}
