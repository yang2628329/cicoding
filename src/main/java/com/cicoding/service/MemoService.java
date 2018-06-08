package com.cicoding.service;

import java.util.List;

import com.cicoding.bean.Memo;

public interface MemoService {
	String addMemo(String title , String text , String time);
	List<Memo> getUserMemoList();
	String deleteMemo(int id);
}
