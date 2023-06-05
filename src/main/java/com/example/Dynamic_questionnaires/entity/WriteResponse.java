package com.example.Dynamic_questionnaires.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "writeresponse")
public class WriteResponse {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "response_id")
    private int responseId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserInfo user;

    @ManyToOne
    @JoinColumn(name = "form_id")
    private FormContent form;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;
    
    
    @Column(name = "response_content")
    private String responseContent;

    @Column(name = "response_time")
    private LocalDate responseTime;

	public WriteResponse() {
		
	}

	public WriteResponse(int responseId, UserInfo user, FormContent form, Question question, String responseContent,
			LocalDate responseTime) {
		this.responseId = responseId;
		this.user = user;
		this.form = form;
		this.question = question;
		this.responseContent = responseContent;
		this.responseTime = responseTime;
	}

	public int getResponseId() {
		return responseId;
	}

	public void setResponseId(int responseId) {
		this.responseId = responseId;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public FormContent getForm() {
		return form;
	}

	public void setForm(FormContent form) {
		this.form = form;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getResponseContent() {
		return responseContent;
	}

	public void setResponseContent(String responseContent) {
		this.responseContent = responseContent;
	}

	public LocalDate getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(LocalDate responseTime) {
		this.responseTime = responseTime;
	}
    
	
    
}
