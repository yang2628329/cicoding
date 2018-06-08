package com.cicoding.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.cicoding.bean.Memo;
import com.cicoding.constant.Constant;
import com.cicoding.dao.MemoMapper;
import com.cicoding.service.MemoService;
import com.cicoding.utils.Userinfo;
@Service
public class MemoServiceImpl implements MemoService{
	@Autowired
	private MemoMapper mapper;
	
	@Override
	public String addMemo(String title, String text, String time) {
		Memo memo = new Memo();
		memo.setTitle(title);
		memo.setText(text);
		memo.setTime(time);
		memo.setUserid(Userinfo.getUserid());
		int result = mapper.insert(memo);
		if (result == 1) {
			return Constant.OPERATION_SUCCESS_CODE;
		}
		return Constant.ERROR_ADD_MEMO;
	}

	@Override
	public List<Memo> getUserMemoList() {
		return mapper.selectList(new EntityWrapper<Memo>().eq("userid", Userinfo.getUserid()));
	}

	@Override
	public String deleteMemo(int id) {
		int result = mapper.deleteById(id);
		if (result == 1) {
			return Constant.OPERATION_SUCCESS_CODE;
		}
		return Constant.ERROR_DELETE_MEMO;
	}

}
