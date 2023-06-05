package com.example.Dynamic_questionnaires.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dynamic_questionnaires.service.ifs.WriteResponseService;
import com.example.Dynamic_questionnaires.vo.request.WriteResponseRequest;
import com.example.Dynamic_questionnaires.vo.response.WriteResponseResponse;

@RestController
public class WriteResponseController {
	
	@Autowired
	private WriteResponseService writeResponseService;

	@PostMapping("/addResponse")
	public WriteResponseResponse addResponse(@RequestBody WriteResponseRequest writeResponseRequest) {
		return writeResponseService.addResponse(writeResponseRequest);
	}
	
	
	@PostMapping("/updateResponse")
	public WriteResponseResponse updateResponse(@RequestBody WriteResponseRequest writeResponseRequest) {
		return writeResponseService.addResponse(writeResponseRequest);
	}
	
	
	@PostMapping("/deleteResponse")
	public WriteResponseResponse deleteResponse(@RequestBody WriteResponseRequest writeResponseRequest) {
		return writeResponseService.addResponse(writeResponseRequest);
	}
}
