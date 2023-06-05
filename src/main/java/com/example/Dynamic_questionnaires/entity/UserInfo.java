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
@Table(name = "userinfo")
public class UserInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private int userId;

	@ManyToOne
	@JoinColumn(name = "form_id")
	private FormContent formContent;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "age")
	private int age;

	@Column(name = "phone")
	private String phone;

	public UserInfo() {

	}

	
	public UserInfo(int userId, FormContent formContent, String userName, String email, int age, String phone) {
		this.userId = userId;
		this.formContent = formContent;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.phone = phone;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	
	
	public FormContent getFormContent() {
		return formContent;
	}


	public void setFormContent(FormContent formContent) {
		this.formContent = formContent;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
