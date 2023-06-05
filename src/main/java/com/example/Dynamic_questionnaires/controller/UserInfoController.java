package com.example.Dynamic_questionnaires.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dynamic_questionnaires.entity.UserInfo;
import com.example.Dynamic_questionnaires.service.ifs.UserInfoService;
import com.example.Dynamic_questionnaires.vo.request.UserInfoRequest;
import com.example.Dynamic_questionnaires.vo.response.UserInfoResponse;

@RestController
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@PostMapping("/adduserInfo")
	public UserInfoResponse adduserInfo(@RequestBody UserInfoRequest userInfoRequest) {
		return userInfoService.adduserInfo(userInfoRequest);
	}

	
	@GetMapping("/getAllUserInfo")
	public List<UserInfo> getAllUserInfo(){
		return userInfoService.getAllUserInfo();
	}
}
