package com.changyou.activity.bean;

import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

import com.cyou.common.datasource.entity.SuperEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Table(name = "ds_active_config")
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ActiveConfigEntity extends SuperEntity {
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

	private Date startDate;
	private Date endDate;

	private String appCode;
	private String activityCode;
	private String versionCode;
}
