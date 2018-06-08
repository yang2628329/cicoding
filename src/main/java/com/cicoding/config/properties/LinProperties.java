package com.cicoding.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Cicoding系统的一些属性
 */
@Component
public class LinProperties {
	public static final String PREFIX = "cicoding";
	/**
	 * 验证码开关
	 */
	@Value("${cicoding.kaptchaswich}")
	private boolean kptchaswich = false;

	public boolean isKptchaswich() {
		return kptchaswich;
	}

	public void setKptchaswich(boolean kptchaswich) {
		this.kptchaswich = kptchaswich;
	}


	
	
	
}
