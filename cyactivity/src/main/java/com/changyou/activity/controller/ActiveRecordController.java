package com.changyou.activity.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.cyou.activity.util.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.changyou.activity.bean.ActiveConfigEntity;
import com.changyou.activity.bean.ActiveRecordEntity;
import com.changyou.activity.service.ActiveConfigService;
import com.changyou.activity.service.ActiveRecordService;
import com.changyou.activity.util.ResCode;
import com.cyou.activity.common.BaseController;
import com.cyou.activity.common.entity.WxUserEntity;
import com.cyou.common.parent.bean.Result;

@RestController
@RequestMapping("/wb/{server}/active")
public class ActiveRecordController extends BaseController {
	
	@Autowired
	private ActiveRecordService service;
	@Autowired
	private ActiveConfigService cService;

	/**
	 * 参与活动
	 * 
	 * @param request
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@PostMapping("/save")
	public Result<ActiveRecordEntity> save(HttpServletRequest request) {

    	//判断参数
    	String content = request.getParameter("content");
    	String birthday = request.getParameter("birthday");
    	String sex = request.getParameter("sex");
    	
    	if(birthday == null || "".equals(birthday)
    			|| sex == null || "".equals(sex) ) {
    		return new Result<>().setCodeAndMessage(ResCode.ResCode20020);
    	}

    	//保存
    	String wxId = getWxId(request);
    	if(null == wxId){
			return new Result<>().setCodeAndMessage(ResCode.ResCode20001);
		}
    	ActiveRecordEntity obj = new ActiveRecordEntity();
    	obj.setWxId(wxId);
    	obj.setContent(content);
    	obj.setBirthday(birthday);
    	obj.setSex(sex);
    	
    	obj.setAppCode(getGame());
    	obj.setActivityCode(getActivity());
    	obj.setVersionCode(getVersion());
		return service.insert(obj);
	}

	/**
	 * 	查询参与信息
	 * 
	 * @return
	 */
    @SuppressWarnings("unchecked")
	@PostMapping("/info")
	public Result<ActiveRecordEntity> info(HttpServletRequest request) {
		String wxId = getWxId(request);
		if(wxId == null) {
			return new Result<>().setCodeAndMessage(ResCode.ResCode20000).setData(null);
		}
		ActiveRecordEntity res = service.findOne(wxId);
		if(res == null) {
			return new Result<>().setCodeAndMessage(ResCode.ResCode20000).setData(null);
		}
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("wxId", res.getWxId());
		data.put("date", res.getDate());
		data.put("giftName", res.getGiftName());
		data.put("giftCode", res.getGiftCode());
		data.put("content", res.getContent());
		data.put("sex", res.getSex());
		data.put("birthday", res.getBirthday());
		return new Result<>().setCodeAndMessage(ResCode.ResCode20000).setData(data);
	}
    

	/**
	 * 	查询活动配置
	 * 
	 * @return
	 */
    @SuppressWarnings("unchecked")
	@GetMapping("/config")
	public Result<ActiveConfigEntity> config() {
		ActiveConfigEntity res = cService.findOne();
		if(res == null) {
			return new Result<>().setCodeAndMessage(ResCode.ResCode20015).setData(res);
		}
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("startDate", res.getStartDate());
		data.put("endDate", res.getEndDate());
		return new Result<>().setCodeAndMessage(ResCode.ResCode20000).setData(data);
	}
    
    private String getWxId(HttpServletRequest request) {
		if(SpringContextUtil.profileIsConTest())
			return request.getParameter("openid");
    	WxUserEntity user = getWeixinUser(request);
    	return user.getWxId();
    	//return "123";
    }
}
