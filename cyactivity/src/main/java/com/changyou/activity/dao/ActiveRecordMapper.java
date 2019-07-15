package com.changyou.activity.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.changyou.activity.bean.ActiveRecordEntity;
import com.cyou.common.datasource.mapper.SuperMapper;

@Mapper
public interface ActiveRecordMapper extends SuperMapper<ActiveRecordEntity> {
	
	@Insert("insert into ds_active_record("
			+ " id, create_name, create_by, create_date, update_name, update_by, update_date, sys_org_code, sys_company_code, bpm_status, "
			+ " wx_id, date, gift_name, gift_code, content, sex, birthday, "
			+ " app_code, activity_code, version_code) " 
			+"  values("
			+ "	#{id}, #{createName}, #{createBy}, #{createDate}, #{updateName}, #{updateBy}, #{updateDate}, #{sysOrgCode}, #{sysCompanyCode}, #{bpmStatus}, "
			+ "	#{wxId}, #{date}, #{giftName}, #{giftCode}, #{content}, #{sex}, #{birthday}, "
			+ "#{appCode}, #{activityCode}, #{versionCode}) ")
	int insert(ActiveRecordEntity obj);
	
    @Select("select * from ds_active_record where wx_id = #{wxId}")
    ActiveRecordEntity findOne(String wxId);
}
