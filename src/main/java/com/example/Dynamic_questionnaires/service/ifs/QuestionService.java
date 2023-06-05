package com.example.Dynamic_questionnaires.service.ifs;

import com.example.Dynamic_questionnaires.vo.request.QuestionRequest;
import com.example.Dynamic_questionnaires.vo.response.QuestionResponse;

public interface QuestionService {
	
	public QuestionResponse addQuestion(QuestionRequest questionRequest);
	
	public QuestionResponse updateQuestion(QuestionRequest questionRequest);
	
	public QuestionResponse deleteQuestion(QuestionRequest questionRequest);
	
	
}
