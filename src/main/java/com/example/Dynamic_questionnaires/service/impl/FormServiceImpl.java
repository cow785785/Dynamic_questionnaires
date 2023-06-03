package com.example.Dynamic_questionnaires.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.Dynamic_questionnaires.entity.FormContent;
import com.example.Dynamic_questionnaires.repository.FormDao;
import com.example.Dynamic_questionnaires.service.ifs.FormService;
import com.example.Dynamic_questionnaires.vo.request.FormRequest;
import com.example.Dynamic_questionnaires.vo.response.FormResponse;

@Service
public class FormServiceImpl implements FormService {
		
	@Autowired
	private FormDao formDao;

	@Override
	public FormResponse addForm(FormRequest formRequest) {
		if (!StringUtils.hasText(formRequest.getFormName())) {
			return new FormResponse("老哥不要空白");
		}
		if (formRequest.getStartTime()==null) {
			return new FormResponse("開始時間不要空白");
		}
		if(formRequest.getEndTime()==null) {
			return new FormResponse("結束時間不要空白");
		}
		if (formRequest.getStartTime().isAfter(formRequest.getEndTime())) {
			return new FormResponse("開始時間不能晚於結束時間");
		}
		if(formRequest.getEndTime().isBefore(formRequest.getStartTime())) {
			return new FormResponse("結束時間不能早於開始時間");
		}
		 
		
		FormContent form = new FormContent(formRequest.getFormId(), formRequest.getFormName(),formRequest.getStartTime(),formRequest.getEndTime());
		formDao.save(form);
		return new FormResponse("完成");
	}

	@Override
	public FormResponse updateForm(FormRequest formRequest) {
	    if (formRequest.getFormId() == 0) {
	        return new FormResponse("表單ID為必填欄位");
	    }
	    if (!StringUtils.hasText(formRequest.getFormName())) {
			return new FormResponse("老哥不要空白");
		}
		if (formRequest.getStartTime()==null) {
			return new FormResponse("開始時間不要空白");
		}
		if(formRequest.getEndTime()==null) {
			return new FormResponse("結束時間不要空白");
		}
		if (formRequest.getStartTime().isAfter(formRequest.getEndTime())) {
			return new FormResponse("開始時間不能晚於結束時間");
		}
		if(formRequest.getEndTime().isBefore(formRequest.getStartTime())) {
			return new FormResponse("結束時間不能早於開始時間");
		}
	    
	    Optional<FormContent> optionalForm = formDao.findById(formRequest.getFormId());
	    if (optionalForm.isPresent()) {
	        FormContent form = optionalForm.get();
	        // 更新表單的其他屬性
	        form.setFormName(formRequest.getFormName());
	        form.setStartTime(formRequest.getStartTime());
	        form.setEndTime(formRequest.getEndTime());
	        
	        formDao.save(form);
	        
	        return new FormResponse("表單更新成功");
	    } else {
	        return new FormResponse("找不到對應的表單");
	    }
	}


	@Override
	public FormResponse deleteForm(FormRequest formRequest) {
		Optional<FormContent> optional = formDao.findById(formRequest.getFormId());
		if (!optional.isPresent()) {
			return new FormResponse("沒有這個咚咚~~");
		}
		FormContent form = optional.get();
		formDao.delete(form);
		return new FormResponse("已刪除");
	}

	@Override
	public List<FormContent> getAllForm() {
		
		return formDao.findAll();
	}

	

}
