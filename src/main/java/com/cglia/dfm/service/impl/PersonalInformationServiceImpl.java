package com.cglia.dfm.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cglia.dfm.entity.PersonalInformation;
import com.cglia.dfm.repository.PersonalInformationRepository;
import com.cglia.dfm.service.PersonalInformationService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PersonalInformationServiceImpl implements PersonalInformationService{
	
	private PersonalInformationRepository personalInformationRepository;
	
	@Override
	public List<PersonalInformation> findByFirstName(String firstName) {
		
		return personalInformationRepository.searchByFirstName(firstName);
	}

}
