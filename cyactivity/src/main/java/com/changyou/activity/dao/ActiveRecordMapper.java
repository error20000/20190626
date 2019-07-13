package com.changyou.activity.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.changyou.activity.bean.ActiveRecordEntity;
import com.cyou.common.datasource.mapper.SuperMapper;

@Mapper
public interface ActiveRecordMapper extends SuperMapper<ActiveRecordEntity> {

	@Insert("insert into ds_active_record(pid, app_code, openid, create_time, plat, phone, invite_code, used_code, activity_code, version_code) " +
            "  values(#{pid}, #{appCode}, #{openid}, #{createTime}, #{plat}, #{phone}, #{inviteCode}, #{usedCode}, #{activityCode}, #{versionCode}) ")
	int insert(ActiveRecordEntity obj);
	
    @Select("select * from ds_active_record where wx_id = #{wxId}")
    ActiveRecordEntity findOne(String wxId);
}
