package com.cglia.dfm.controller;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.dfm.dto.ElementDTO;
import com.cglia.dfm.entity.Element;
import com.cglia.dfm.entity.FormSavedJSON;
import com.cglia.dfm.service.ElementService;
import com.cglia.dfm.service.FormSavedJsonService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ElementController {

    private final ElementService elementService;
    
    private final FormSavedJsonService formService;

    public ElementController(ElementService elementService, FormSavedJsonService formService) {
        this.elementService = elementService;
        this.formService  = formService;
    }

    @GetMapping("/getElementNames")
    public List<String> getElementNames() {
        return elementService.getAllElementNames();
    }

    @GetMapping("/getElementsWithProperties")
    public List<Element> getElementsWithProperties() {
        return elementService.getAllElements();
    }
    
    @GetMapping("/getElementProperties/{elementName}")
    public ElementDTO greetUser(@PathVariable String elementName) {
        return elementService.getElementById(elementName);
    }
    
    @GetMapping("/getFormByName/{formName}")
    public FormSavedJSON getFormSavedJson(@PathVariable String formName) {
		return formService.getFormByName(formName);
    	
    }
    
    @PutMapping("/saveFormValues")
    public FormSavedJSON saveFormValuesById(@RequestBody FormSavedJSON formsavedJson) {
    	return formService.saveFormValues(formsavedJson);
    }
    
  
}
