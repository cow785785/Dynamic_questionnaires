package com.example.Dynamic_questionnaires.service.ifs;

import java.util.List;

import com.example.Dynamic_questionnaires.entity.Form;
import com.example.Dynamic_questionnaires.vo.request.FormRequest;
import com.example.Dynamic_questionnaires.vo.response.FormResponse;

public interface FormService {
	public FormResponse addForm(FormRequest formRequest);
	
	public FormResponse updateForm(FormRequest formRequest);
	
	public FormResponse deleteForm(FormRequest formRequest);
	
	public List<Form> getAllForm();
}
