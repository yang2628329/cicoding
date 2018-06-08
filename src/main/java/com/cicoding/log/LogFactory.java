package com.cicoding.log;

import java.util.Date;

import com.cicoding.bean.LoginLog;
import com.cicoding.bean.OperationLog;
import com.cicoding.constant.state.LogState;
import com.cicoding.constant.state.LogType;

public class LogFactory {
	
	private static OperationLog operLog;
	
	private static LoginLog loginLog;
	
	public static OperationLog newOperationLogInstance(int userid , String classname ,String logname,
			LogType logtype, String message , String method,LogState state											
			){
		operLog = new OperationLog();
		operLog.setClassname(classname);
		operLog.setCreatetime(new Date());
		operLog.setLogname(logname);
		operLog.setLogtype(logtype.getMessage());
		operLog.setMessage(message);
		operLog.setMethod(method);
		operLog.setState(state.getMessage());
		operLog.setUserid(userid);
		return operLog;
	}
	
	public static LoginLog newLoginLogIntstance(Integer userid , LogType logType , LogState logState ,String message , String ip){
		loginLog = new LoginLog();
		loginLog.setIp(ip);
		loginLog.setLogname(logType.getMessage());
		loginLog.setMessage(message);
		loginLog.setState(logState.getMessage());
		loginLog.setUserid(userid);
		loginLog.setCreatetime(new Date());
		return loginLog;
	}
	
}
