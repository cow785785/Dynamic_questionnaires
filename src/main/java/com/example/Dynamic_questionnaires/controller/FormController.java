package com.example.Dynamic_questionnaires.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Dynamic_questionnaires.entity.FormContent;
import com.example.Dynamic_questionnaires.service.ifs.FormService;
import com.example.Dynamic_questionnaires.vo.request.FormRequest;
import com.example.Dynamic_questionnaires.vo.response.FormResponse;
//@CrossOrigin
@RestController
public class FormController {
	
	@Autowired
	private FormService formService;

	@PostMapping("/addForm")
	public FormResponse addForm(@RequestBody FormRequest formRequest) {
		return formService.addForm(formRequest);
	}

	@PostMapping("/updateForm")
	public FormResponse updateForm(@RequestBody FormRequest formRequest) {
		return formService.updateForm(formRequest);
	}

	@PostMapping("/deleteForm")
	public FormResponse deleteForm(@RequestBody FormRequest formRequest) {
		return formService.deleteForm(formRequest);
	}
	
	@PostMapping("/getAllForm")
	public List<FormContent> getAllForm(){
		return formService.getAllForm();
	}
}
