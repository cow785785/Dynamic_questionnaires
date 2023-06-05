package com.example.Dynamic_questionnaires.service.ifs;

import com.example.Dynamic_questionnaires.vo.request.WriteResponseRequest;
import com.example.Dynamic_questionnaires.vo.response.WriteResponseResponse;

public interface WriteResponseService {
	
	public WriteResponseResponse addResponse(WriteResponseRequest writeResponseRequest);
	
	public WriteResponseResponse updateResponse(WriteResponseRequest writeResponseRequest);
	
	public WriteResponseResponse deleteResponse(WriteResponseRequest writeResponseRequest);
	
}
