package com.cglia.dfm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cglia.dfm.dto.FormJsonDTO;
import com.cglia.dfm.entity.FormSavedJSON;
import com.cglia.dfm.service.FormSavedJsonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/slu1")
@CrossOrigin(origins="*")
public class FormRenderController {
	
	private final FormSavedJsonService formService;
	
	
	@Autowired
	public FormRenderController(FormSavedJsonService formService) {
		this.formService = formService;
	}

	@GetMapping("/FORM_PERSONNELINFO")
	public String generateForm() {
		return "form-render/create-form";
	}
	
	@GetMapping("/form-render")
	public String renderForm(Model model) throws JsonProcessingException {
	    String formName = "iacuc";
	    FormSavedJSON newForm = formService.getFormByName(formName);
	    if (newForm != null) {
	        String formJsonString = newForm.getFormJson();
	        ObjectMapper mapper = new ObjectMapper();
	        FormJsonDTO formJson = mapper.readValue(formJsonString, FormJsonDTO.class);
	        model.addAttribute("formJson", formJson);
	    }
	    return "form-render/view-form";
	}
}
