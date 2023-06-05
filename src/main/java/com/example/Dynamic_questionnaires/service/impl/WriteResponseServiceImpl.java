package com.example.Dynamic_questionnaires.service.impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dynamic_questionnaires.entity.WriteResponse;
import com.example.Dynamic_questionnaires.repository.FormContentDao;
import com.example.Dynamic_questionnaires.repository.QuestionDao;
import com.example.Dynamic_questionnaires.repository.UserInfoDao;
import com.example.Dynamic_questionnaires.repository.WriteResponseDao;
import com.example.Dynamic_questionnaires.service.ifs.WriteResponseService;
import com.example.Dynamic_questionnaires.vo.request.WriteResponseRequest;
import com.example.Dynamic_questionnaires.vo.response.WriteResponseResponse;

@Service
public class WriteResponseServiceImpl implements WriteResponseService {

	@Autowired
	private WriteResponseDao writeResponseDao;

	@Autowired
	private UserInfoDao userInfoDao;

	@Autowired
	private FormContentDao formContentDao;

	@Autowired
	private QuestionDao questionDao;

	@Override
	public WriteResponseResponse addResponse(WriteResponseRequest writeResponseRequest) {
		WriteResponse writeResponse = new WriteResponse();
		writeResponse.setUser(userInfoDao.findById(writeResponseRequest.getUserId()).orElse(null));
		writeResponse.setForm(formContentDao.findById(writeResponseRequest.getFormId()).orElse(null));
		writeResponse.setQuestion(questionDao.findById(writeResponseRequest.getQuestionId()).orElse(null));
		writeResponse.setResponseContent(writeResponseRequest.getResponseContent());
		writeResponse.setResponseTime(LocalDate.now());

		WriteResponse savedWriteResponse = writeResponseDao.save(writeResponse);
		return new WriteResponseResponse("填寫成功");
	}

	/*
	 * 在updateResponse方法中，根據responseId從資料庫中獲取對應的回應物件。
	 * 如果找不到該回應，可以返回一個包含錯誤訊息的WriteResponseResponse物件。
	 * 如果找到該回應，可以根據writeResponseRequest的資訊更新回應物件的相應屬性，並將其保存至資料庫。
	 * 根據保存的結果，可以返回相應的成功或失敗訊息。
	 */

	@Override
	public WriteResponseResponse updateResponse(WriteResponseRequest writeResponseRequest) {
		int responseId = writeResponseRequest.getResponseId();
		WriteResponse writeResponse = writeResponseDao.findById(responseId).orElse(null);

		if (writeResponse == null) {
			return new WriteResponseResponse("找不到該回應");
		}

		writeResponse.setResponseContent(writeResponseRequest.getResponseContent());
		writeResponse.setResponseTime(LocalDate.now());

		WriteResponse updatedWriteResponse = writeResponseDao.save(writeResponse);

		if (updatedWriteResponse != null) {
			return new WriteResponseResponse("回應更新成功");
		} else {
			return new WriteResponseResponse("回應更新失敗");
		}
	}

	
	
	/*
	 * 在deleteResponse方法中，根據responseId從資料庫中獲取對應的回應物件。
	 * 如果找不到該回應，返回一個包含錯誤訊息的WriteResponseResponse物件。
	 * 如果找到該回應，使用writeResponseDao的delete方法刪除該回應物件。
	 * 無論刪除是否成功，都可以返回相應的成功訊息。
	 */
	
	@Override
	public WriteResponseResponse deleteResponse(WriteResponseRequest writeResponseRequest) {
		int responseId = writeResponseRequest.getResponseId();
		WriteResponse writeResponse = writeResponseDao.findById(responseId).orElse(null);

		if (writeResponse == null) {
			return new WriteResponseResponse("找不到該回應");
		}

		writeResponseDao.delete(writeResponse);

		return new WriteResponseResponse("回應刪除成功");
	}

}
