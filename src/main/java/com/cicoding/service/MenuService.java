package com.cicoding.service;

import java.util.List;

import com.cicoding.bean.Menu;

public interface MenuService {
	List<Menu> getUserMenu();
	String menuTreeData();
}
