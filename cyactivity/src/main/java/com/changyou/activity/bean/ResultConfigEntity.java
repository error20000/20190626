package com.changyou.activity.bean;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

import com.cyou.common.datasource.entity.SuperEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Table(name = "ds_result_config")
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ResultConfigEntity extends SuperEntity {
	@Id
	private String id;
	private String createName;
	private String createBy;
	private Date createDate;
	private String updateName;
	private String updateBy;
	private Date updateDate;
	private String sysOrgCode;
	private String sysCompanyCode;
	private String bpmStatus;

	private String constellation;
	private String startDate;
	private String endDate;
	private String name1;
	private String code1;
	private String name2;
	private String code2;

	private String appCode;
	private String activityCode;
	private String versionCode;
}
