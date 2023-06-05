package com.example.Dynamic_questionnaires.vo.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionOptionResponse {
	private int optionId;

	private int questionId;

	private String optionContent;

	private String message;

	public QuestionOptionResponse() {

	}

	public QuestionOptionResponse(int optionId, int questionId, String optionContent, String message) {
		this.optionId = optionId;
		this.questionId = questionId;
		this.optionContent = optionContent;
		this.message = message;
	}

	public QuestionOptionResponse(String message) {
		this.message = message;
	}

	public int getOptionId() {
		return optionId;
	}

	public void setOptionId(int optionId) {
		this.optionId = optionId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getOptionContent() {
		return optionContent;
	}

	public void setOptionContent(String optionContent) {
		this.optionContent = optionContent;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
