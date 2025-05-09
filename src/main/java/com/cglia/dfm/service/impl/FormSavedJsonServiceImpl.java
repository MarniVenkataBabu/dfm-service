package com.cglia.dfm.service.impl;

import org.springframework.stereotype.Service;

import com.cglia.dfm.entity.FormSavedJSON;
import com.cglia.dfm.repository.FormSavedJsonRepository;
import com.cglia.dfm.service.FormSavedJsonService;

@Service
public class FormSavedJsonServiceImpl implements FormSavedJsonService{

	private final FormSavedJsonRepository formRepository;
	
	
	public FormSavedJsonServiceImpl(FormSavedJsonRepository formRepository) {
		this.formRepository = formRepository;
	}


	@Override
	public FormSavedJSON getFormByName(String formName) {
		
		return formRepository.findByFormName(formName);
	}


	@Override
	public FormSavedJSON saveFormValues(FormSavedJSON valuesSavedJson) {
		
		return formRepository.save(valuesSavedJson);
	}

}
