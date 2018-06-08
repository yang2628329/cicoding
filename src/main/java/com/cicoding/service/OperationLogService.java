package com.cicoding.service;

import java.util.List;

import com.cicoding.bean.OperationLog;
import com.cicoding.bean.ShowLog;


public interface OperationLogService {
	
	public List<OperationLog> getAllOperationLog();

	public List<ShowLog> getAllShowLog();
	
	public String deleteALLLog();
	
	public String getShowLogJson(int page , int count);
	
	
}
