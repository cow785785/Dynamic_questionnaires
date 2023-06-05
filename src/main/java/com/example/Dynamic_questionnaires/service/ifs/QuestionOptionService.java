package com.example.Dynamic_questionnaires.service.ifs;

import com.example.Dynamic_questionnaires.vo.request.QuestionOptionRequest;
import com.example.Dynamic_questionnaires.vo.response.QuestionOptionResponse;

public interface QuestionOptionService {
	public QuestionOptionResponse addQuestionOption(QuestionOptionRequest questionOptionRequest);

	public QuestionOptionResponse updateQuestionOption(QuestionOptionRequest questionOptionRequest);

	public QuestionOptionResponse deleteQuestionOption(QuestionOptionRequest questionOptionRequest);
}
