package com.example.Dynamic_questionnaires.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dynamic_questionnaires.service.ifs.QuestionService;
import com.example.Dynamic_questionnaires.vo.request.QuestionRequest;
import com.example.Dynamic_questionnaires.vo.response.QuestionResponse;

@CrossOrigin
@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping("/addQuestion")
	public QuestionResponse addQuestion(@RequestBody QuestionRequest questionRequest) {
		return questionService.addQuestion(questionRequest);
	}

	
	@PostMapping("/updateQuestion")
	public QuestionResponse updateQuestion(@RequestBody QuestionRequest questionRequest) {
		return questionService.updateQuestion(questionRequest);
	}

	
	@PostMapping("/deleteQuestion")
	public QuestionResponse deleteQuestion(@RequestBody QuestionRequest questionRequest) {
		return questionService.deleteQuestion(questionRequest);
	}
}
