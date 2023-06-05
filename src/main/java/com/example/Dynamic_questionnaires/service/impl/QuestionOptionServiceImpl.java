package com.example.Dynamic_questionnaires.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dynamic_questionnaires.entity.Question;
import com.example.Dynamic_questionnaires.entity.QuestionOption;
import com.example.Dynamic_questionnaires.repository.QuestionDao;
import com.example.Dynamic_questionnaires.repository.QuestionOptionDao;
import com.example.Dynamic_questionnaires.service.ifs.QuestionOptionService;
import com.example.Dynamic_questionnaires.vo.request.QuestionOptionRequest;
import com.example.Dynamic_questionnaires.vo.response.QuestionOptionResponse;
@Service
public class QuestionOptionServiceImpl implements QuestionOptionService {
	
	@Autowired
	private QuestionOptionDao questionOptionDao;
	
	@Autowired
	private QuestionDao questionDao;

	@Override
	public QuestionOptionResponse addQuestionOption(QuestionOptionRequest questionOptionRequest) {
		Question question = questionDao.findById(questionOptionRequest.getQuestionId()).orElse(null);
        if (question == null) {
            return new QuestionOptionResponse("问题不存在");
        }

        QuestionOption questionOption = new QuestionOption();
        questionOption.setQuestion(question);
        questionOption.setOptionContent(questionOptionRequest.getOptionContent());

        questionOptionDao.save(questionOption);

        return new QuestionOptionResponse("完成");
	}

	@Override
	public QuestionOptionResponse updateQuestionOption(QuestionOptionRequest questionOptionRequest) {
		 QuestionOption questionOption = questionOptionDao.findById(questionOptionRequest.getOptionId()).orElse(null);
	        if (questionOption == null) {
	            return new QuestionOptionResponse("问题选项不存在");
	        }

	        questionOption.setOptionContent(questionOptionRequest.getOptionContent());

	        questionOptionDao.save(questionOption);

	        return new QuestionOptionResponse("完成");
	}

	@Override
	public QuestionOptionResponse deleteQuestionOption(QuestionOptionRequest questionOptionRequest) {
		QuestionOption questionOption = questionOptionDao.findById(questionOptionRequest.getOptionId()).orElse(null);
        if (questionOption == null) {
            return new QuestionOptionResponse("问题选项不存在");
        }

        questionOptionDao.delete(questionOption);

        return new QuestionOptionResponse("完成");
	}

}
