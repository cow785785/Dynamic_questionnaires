package com.example.Dynamic_questionnaires.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dynamic_questionnaires.entity.FormContent;
import com.example.Dynamic_questionnaires.entity.UserInfo;
import com.example.Dynamic_questionnaires.repository.FormContentDao;
import com.example.Dynamic_questionnaires.repository.UserInfoDao;
import com.example.Dynamic_questionnaires.service.ifs.UserInfoService;
import com.example.Dynamic_questionnaires.vo.request.UserInfoRequest;
import com.example.Dynamic_questionnaires.vo.response.UserInfoResponse;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;
	
	@Autowired
	private FormContentDao formContentDao;


	public boolean checkPhone(String phone) {
	    // 以"09"或"886"開頭，後面接9位数字的格式
	    String regex = "^(09|8869)\\d{8}$";
	    return phone.matches(regex);
	}

	
	@Override
	public UserInfoResponse adduserInfo(UserInfoRequest userInfoRequest) {
		if (userInfoRequest.getUserName() == null || userInfoRequest.getUserName().isEmpty()) {
			return new UserInfoResponse("用户名不能為空");
		}

		if (userInfoRequest.getEmail() == null || userInfoRequest.getEmail().isEmpty()) {
			return new UserInfoResponse("信箱不得為空");
		}
		
		if (userInfoRequest.getAge() <= 0 || userInfoRequest.getAge() > 150) {
	        return new UserInfoResponse("年齡超過正常範圍");
	    }

		if(userInfoRequest.getPhone()==null || userInfoRequest.getPhone().isEmpty()) {
			return new UserInfoResponse("電話簿不得為空");
		}
		if(!checkPhone(userInfoRequest.getPhone())) {
			return new UserInfoResponse("電話格式有誤，請再檢查一遍");
		}
		
		 FormContent formContent = formContentDao.findById(userInfoRequest.getFormId()).orElse(null);
		    if (formContent == null) {
		        return new UserInfoResponse("找不到表单");
		    }

		
		UserInfo userInfo = new UserInfo();
		userInfo.setFormContent(formContent);
		userInfo.setUserName(userInfoRequest.getUserName());
		userInfo.setEmail(userInfoRequest.getEmail());
		userInfo.setAge(userInfoRequest.getAge());
		userInfo.setPhone(userInfoRequest.getPhone());

		userInfoDao.save(userInfo);

		return new UserInfoResponse("完成");
	}


	@Override
	public List<UserInfo> getAllUserInfo() {

		return userInfoDao.findAll();
	}

}
