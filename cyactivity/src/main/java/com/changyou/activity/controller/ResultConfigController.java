package com.changyou.activity.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.changyou.activity.bean.ResultConfigEntity;
import com.changyou.activity.service.ResultConfigService;
import com.changyou.activity.util.ResCode;
import com.cyou.activity.common.BaseController;
import com.cyou.common.parent.bean.Result;

@RestController
@RequestMapping("/wb/{server}/")
public class ResultConfigController extends BaseController {
	
	@Autowired
	private ResultConfigService service;

	/**
	 * 查询痴情人
	 * 
	 * @param request
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@PostMapping("/result")
	public Result<ResultConfigEntity> insertLevelLog(HttpServletRequest request) {
		String birthday = request.getParameter("birthday");
		String sex = request.getParameter("sex");
		if (birthday == null || "".equals(birthday) || sex == null || "".equals(sex)) {
			return new Result<>().setCodeAndMessage(ResCode.ResCode20020);
		}
		Map<String, Object> res = service.findLover(birthday, Integer.valueOf(sex));
		return new Result<>().setCodeAndMessage(ResCode.ResCode20000).setData(res);
	}

}
