package com.example.Dynamic_questionnaires.vo.response;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormResponse {
	private String formName;

	private LocalDate createdDate;

	private LocalDate startTime;

	private LocalDate endTime;

	private boolean status;

	private String message;

	public FormResponse() {

	}

	public FormResponse(String formName, LocalDate createdDate, LocalDate startTime, LocalDate endTime, boolean status,
			String message) {
		this.formName = formName;
		this.createdDate = createdDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
		this.message = message;
	}
	
	

	public FormResponse(String message) {
		this.message = message;
	}

	public String getFormName() {
		return formName;
	}

	public void setFormName(String formName) {
		this.formName = formName;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
