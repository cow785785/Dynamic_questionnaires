package com.example.Dynamic_questionnaires.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dynamic_questionnaires.entity.FormContent;
import com.example.Dynamic_questionnaires.entity.Question;
import com.example.Dynamic_questionnaires.entity.QuestionOption;
import com.example.Dynamic_questionnaires.repository.FormContentDao;
import com.example.Dynamic_questionnaires.repository.QuestionDao;
import com.example.Dynamic_questionnaires.repository.QuestionOptionDao;
import com.example.Dynamic_questionnaires.service.ifs.QuestionService;
import com.example.Dynamic_questionnaires.vo.request.QuestionRequest;
import com.example.Dynamic_questionnaires.vo.response.QuestionResponse;
@Service
public class QuestionServiceImpl implements QuestionService {
	
	@Autowired
    private QuestionDao questionDao;

    @Autowired
    private QuestionOptionDao questionOptionDao;
    
    @Autowired
    private FormContentDao formContentDao;

	@Override
	public QuestionResponse addQuestion(QuestionRequest questionRequest) {
		Question question = new Question();
		FormContent formContent = formContentDao.findById(questionRequest.getFormId()).orElse(null);
	    if (formContent == null) {
	        return new QuestionResponse("表单不存在");
	    }
		question.setFormContent(formContent);
        question.setQuestionType(questionRequest.getQuestionType());
        question.setQuestionContent(questionRequest.getQuestionContent());

     // 保存 Question 实体对象到数据库
        questionDao.save(question);
        
        // 创建问题选项并保存到数据库
        for (String optionContent : questionRequest.getOptions()) {
            QuestionOption questionOption = new QuestionOption();
            questionOption.setQuestion(question);
            questionOption.setOptionContent(optionContent);
            questionOptionDao.save(questionOption);
        }

        return new QuestionResponse("完成");
	}

	@Override
	public QuestionResponse updateQuestion(QuestionRequest questionRequest) {
		 Question question = questionDao.findById(questionRequest.getQuestionId()).orElse(null);
		    if (question == null) {
		        return new QuestionResponse("问题不存在");
		    }

		    question.setQuestionType(questionRequest.getQuestionType());
		    question.setQuestionContent(questionRequest.getQuestionContent());
		    
		    questionDao.save(question);
		    
		    return new QuestionResponse("完成");
	}

	@Override
	public QuestionResponse deleteQuestion(QuestionRequest questionRequest) {
		// 根據 questionId 查詢要删除的 Question 对象
	    Question question = questionDao.findById(questionRequest.getQuestionId()).orElse(null);
	    if (question == null) {
	        return new QuestionResponse("问题不存在");
	    }

	    // 删除問題選項
	    questionOptionDao.deleteByQuestion(question);//如果問題存在，使用questionOptionDao.deleteByQuestion(question) 方法删除與該問題相關聯的問題選項。

	    // 删除 Question
	    questionDao.delete(question);

	    return new QuestionResponse("完成");
	}

}
