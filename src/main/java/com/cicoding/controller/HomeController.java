package com.cicoding.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cicoding.bean.Menu;
import com.cicoding.bean.ShowNotice;
import com.cicoding.bean.User;
import com.cicoding.config.properties.LinProperties;
import com.cicoding.service.MenuService;
import com.cicoding.service.NoticeService;
import com.cicoding.utils.Userinfo;
import com.google.gson.Gson;
@Controller
public class HomeController {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private LinProperties linProperties;
	@Autowired
	private NoticeService noticeService;
	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value = "/", method = { RequestMethod.GET, RequestMethod.POST })
	public String home(HttpServletRequest request) {
		log.info("home page");
		if (!SecurityUtils.getSubject().isAuthenticated() || Userinfo.getUser() == null) {
			request.setAttribute("kaptcha", linProperties.isKptchaswich());
			return "login2";
		}
		
		//右侧的通知
		List<ShowNotice> list = noticeService.getAllShowNotice();
		request.setAttribute("noticelist", list);
		
		List<Menu> menuList = menuService.getUserMenu();
		request.setAttribute("menulist", menuList);
		
		request.setAttribute("username", Userinfo.getUsername());
		request.setAttribute("tip", ((User) SecurityUtils.getSubject().getPrincipal()).getRoleTip());
		request.setAttribute("sex", Userinfo.getSex());
		return "index1";

	}
	
}
