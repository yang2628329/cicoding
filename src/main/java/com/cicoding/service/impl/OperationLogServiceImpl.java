package com.cicoding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.cicoding.bean.OperationLog;
import com.cicoding.bean.ShowLog;
import com.cicoding.constant.Constant;
import com.cicoding.dao.OperationLogMapper;
import com.cicoding.service.OperationLogService;
import com.cicoding.utils.BeanUtil;
import com.cicoding.utils.JqgridUtil;

@Service
public class OperationLogServiceImpl implements OperationLogService {
	@Autowired
	private OperationLogMapper mapper;
	@Autowired
	private BeanUtil beanUtil;
	@Autowired
	private JqgridUtil jqgridUtil;

	@Override
	public List<OperationLog> getAllOperationLog() {
		return mapper.selectList(new EntityWrapper<OperationLog>().orderBy("createtime" , false));
	}

	@Override
	public List<ShowLog> getAllShowLog() {
		return beanUtil.operationLogListToShowLogList(getAllOperationLog());
	}

	@Override
	public String deleteALLLog() {
		int result = mapper.delete(null);
		if (result > 0) {
			return Constant.OPERATION_SUCCESS_CODE;
		} else {
			return Constant.ERROR_DELETE_LOGINLOG_FAIL;
		}
	}



	@Override
	public String getShowLogJson(int page, int count) {
		List<ShowLog> all = getAllShowLog();
		int toIndex = count * page;
		if (all.size() < toIndex) {
			toIndex = all.size();
		}
		List<ShowLog> list = all.subList(count * (page - 1), toIndex);
		return jqgridUtil.getJson(list, page + "", all.size() , count);
	}

}
