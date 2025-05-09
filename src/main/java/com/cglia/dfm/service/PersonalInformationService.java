package com.cglia.dfm.service;

import java.util.List;

import com.cglia.dfm.entity.PersonalInformation;

public interface PersonalInformationService {

	public List<PersonalInformation> findByFirstName(String firstName);
}
