package com.example.Dynamic_questionnaires.vo.response;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserInfoResponse {

	private int userId;

	private int formId;

	private String userName;

	private String email;

	private int age;

	private String phone;

	private String message;

	public UserInfoResponse() {

	}

	// 全部的
	public UserInfoResponse(int userId, int formId, String userName, String email, int age, String phone,
			String message) {
		this.userId = userId;
		this.formId = formId;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.message = message;
	}

	// 沒有ID的
	public UserInfoResponse(int formId, String userName, String email, int age, String phone, String message) {
		this.formId = formId;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.message = message;
	}

	public UserInfoResponse(String message) {
		this.message = message;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
