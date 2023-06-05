package com.example.Dynamic_questionnaires.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_id")
	private int questionId;

	@ManyToOne
	@JoinColumn(name = "form_id")
	private FormContent formContent;

	@Column(name = "question_type")
	private String questionType;

	@Column(name = "question_content")
	private String questionContent;

	public Question() {
		
	}

	public Question(int questionId, FormContent formContent, String questionType, String questionContent) {
		this.questionId = questionId;
		this.formContent = formContent;
		this.questionType = questionType;
		this.questionContent = questionContent;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public FormContent getFormContent() {
		return formContent;
	}

	public void setFormContent(FormContent formContent) {
		this.formContent = formContent;
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
	
	
}
