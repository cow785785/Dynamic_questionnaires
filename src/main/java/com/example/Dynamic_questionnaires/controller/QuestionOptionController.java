package com.example.Dynamic_questionnaires.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dynamic_questionnaires.service.ifs.QuestionOptionService;
import com.example.Dynamic_questionnaires.vo.request.QuestionOptionRequest;
import com.example.Dynamic_questionnaires.vo.response.QuestionOptionResponse;
@CrossOrigin
@RestController
public class QuestionOptionController {
	@Autowired
	private QuestionOptionService questionOptionService;
	
	@PostMapping("/addQuestionOption")
	public QuestionOptionResponse addQuestionOption(@RequestBody QuestionOptionRequest questionOptionRequest) {
		return questionOptionService.addQuestionOption(questionOptionRequest);
	}
	
	@PostMapping("/updateQuestionOption")
	public QuestionOptionResponse updateQuestionOption(@RequestBody QuestionOptionRequest questionOptionRequest) {
		return questionOptionService.updateQuestionOption(questionOptionRequest);
	}
	
	@PostMapping("/deleteQuestionOption")
	public QuestionOptionResponse deleteQuestionOption(@RequestBody QuestionOptionRequest questionOptionRequest) {
		return questionOptionService.deleteQuestionOption(questionOptionRequest);
	}
}
