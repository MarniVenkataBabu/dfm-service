package com.cglia.dfm.service;

import org.springframework.stereotype.Service;

import com.cglia.dfm.entity.FormSavedJSON;


public interface FormSavedJsonService {
	
	public FormSavedJSON getFormByName(String formName);
	public FormSavedJSON saveFormValues(FormSavedJSON valuesSavedJson);
	
}
