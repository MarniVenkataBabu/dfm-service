package com.cglia.dfm.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.dfm.entity.PersonalInformation;
import com.cglia.dfm.service.PersonalInformationService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PersonalInformationController {
	
	
	private PersonalInformationService personalInformationService;
	
	public PersonalInformationController(PersonalInformationService personalInformationService) {
		this.personalInformationService = personalInformationService;
	}
	
	@GetMapping("/findUserByEmail")
	public List<PersonalInformation> findAllByFirstName(@RequestParam("name") String name){
		return personalInformationService.findByFirstName(name);
	}
	
}
