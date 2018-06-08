package com.cicoding.service;

import java.util.List;

import com.cicoding.bean.LoginLog;
import com.cicoding.bean.ShowLog;


public interface LoginLogService {
	
	public List<LoginLog> getAllLoginLog();

	public List<ShowLog> getAllShowLoginLog();
	
	public String deleteALLLoginLog();
	
	public String getShowLogJson(int page, int count);
	
}
