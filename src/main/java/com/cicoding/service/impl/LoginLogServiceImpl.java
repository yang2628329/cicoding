package com.cicoding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.cicoding.bean.LoginLog;
import com.cicoding.bean.ShowLog;
import com.cicoding.constant.Constant;
import com.cicoding.dao.LoginLogMapper;
import com.cicoding.service.LoginLogService;
import com.cicoding.utils.BeanUtil;
import com.cicoding.utils.JqgridUtil;

@Service
public class LoginLogServiceImpl implements LoginLogService {
	
	@Autowired
	private LoginLogMapper loginLogMapper;
	@Autowired
	private BeanUtil beanUtil;
	@Autowired
	private JqgridUtil jqgridUtil;
	@Override
	public List<LoginLog> getAllLoginLog() {

		return loginLogMapper.selectList(new EntityWrapper<LoginLog>().orderBy("createtime" , false));
	}

	@Override
	public List<ShowLog> getAllShowLoginLog() {
		return beanUtil.loginLogListToShowLogList(getAllLoginLog());
	}

	@Override
	public String deleteALLLoginLog() {
		int result = loginLogMapper.delete(null);
		if (result > 0) {
			return Constant.OPERATION_SUCCESS_CODE;
		}else{
			return Constant.ERROR_DELETE_LOGINLOG_FAIL;
		}
	}
	
	@Override
	public String getShowLogJson(int page, int count) {
		List<ShowLog> all = getAllShowLoginLog();
		int toIndex = count * page;
		if (all.size() < toIndex) {
			toIndex = all.size();
		}
		List<ShowLog> list = all.subList(count * (page - 1), toIndex);
		return jqgridUtil.getJson(list, page + "", all.size() , count);
	}

}
