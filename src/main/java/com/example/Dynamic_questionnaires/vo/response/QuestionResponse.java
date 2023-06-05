package com.example.Dynamic_questionnaires.vo.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuestionResponse {
	 private int questionId;
	    
	    private int formId;
	    
	    private String questionType;
	    
	    private String questionContent;
	    
	    private List<String> options;
	    
	    private String message;

		public QuestionResponse() {
			
		}

		public QuestionResponse(int questionId, int formId, String questionType, String questionContent,
				List<String> options, String message) {
			this.questionId = questionId;
			this.formId = formId;
			this.questionType = questionType;
			this.questionContent = questionContent;
			this.options = options;
			this.message = message;
		}

		public QuestionResponse(String message) {
			super();
			this.message = message;
		}

		public int getQuestionId() {
			return questionId;
		}

		public void setQuestionId(int questionId) {
			this.questionId = questionId;
		}

		public int getFormId() {
			return formId;
		}

		public void setFormId(int formId) {
			this.formId = formId;
		}

		public String getQuestionType() {
			return questionType;
		}

		public void setQuestionType(String questionType) {
			this.questionType = questionType;
		}

		public String getQuestionContent() {
			return questionContent;
		}

		public void setQuestionContent(String questionContent) {
			this.questionContent = questionContent;
		}

		public List<String> getOptions() {
			return options;
		}

		public void setOptions(List<String> options) {
			this.options = options;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	    
	    
}
