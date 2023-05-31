package com.example.Dynamic_questionnaires.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "form")
public class Form {
	
	@Id
	@Column(name = "FormId")
	private int formId;
	
	
	@Column(name = "FormName")
	private String formName;
	
	
	@Column(name = "CreatedDate")
	private LocalDate createdDate;
	
	
	@Column(name = "StartTime")
	private LocalDate startTime;
	
	
	@Column(name = "EndTime")
	private LocalDate endTime;

	
	@Column(name = "Status")
	private boolean status;


	public Form() {
		
	}



	


	public Form(int formId, String formName, LocalDate createdDate, LocalDate startTime, LocalDate endTime,
			boolean status) {
		this.formId = formId;
		this.formName = formName;
		this.createdDate = createdDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.status = status;
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
	
	
	
}
