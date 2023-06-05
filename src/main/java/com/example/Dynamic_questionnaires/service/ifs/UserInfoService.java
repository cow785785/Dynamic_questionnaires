package com.example.Dynamic_questionnaires.service.ifs;

import java.util.List;

import com.example.Dynamic_questionnaires.entity.UserInfo;
import com.example.Dynamic_questionnaires.vo.request.UserInfoRequest;
import com.example.Dynamic_questionnaires.vo.response.UserInfoResponse;

public interface UserInfoService {
	
	public UserInfoResponse adduserInfo(UserInfoRequest userInfoRequest);
	
	
	public List<UserInfo> getAllUserInfo();
}
