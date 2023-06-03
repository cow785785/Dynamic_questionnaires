package com.example.Dynamic_questionnaires.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formcontent")
public class FormContent {

	@Id
	@Column(name = "form_id")
	private int formId;

	@Column(name = "form_name")
	private String formName;


	@Column(name = "start_time")
	private LocalDate startTime;

	@Column(name = "end_time")
	private LocalDate endTime;

	@Column(name = "status")
	private boolean status;

	public FormContent() {

	}

	
	//全部的
	public FormContent(int formId, String formName, LocalDate startTime, LocalDate endTime, boolean status) {
		this.formId = formId;
		this.formName = formName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
	}

	
	//沒有status
	public FormContent(int formId, String formName, LocalDate startTime, LocalDate endTime) {
		this.formId = formId;
		this.formName = formName;
		this.startTime = startTime;
		this.endTime = endTime;
	}


	public FormContent(String formName, LocalDate startTime, LocalDate endTime) {
		this.formName = formName;
		this.startTime = startTime;
		this.endTime = endTime;
	}


	public int getFormId() {
		return formId;
	}


	public void setFormId(int formId) {
		this.formId = formId;
	}


	public String getFormName() {
		return formName;
	}


	public void setFormName(String formName) {
		this.formName = formName;
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
	
	
	

}
