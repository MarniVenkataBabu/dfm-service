package com.cglia.dfm.service;

import java.util.List;

import com.cglia.dfm.entity.CountryCodes;

public interface CountryCodesService {

	public List<String> getAllCountryNames();
	
	public List<String> getAllCountryCodes();
	
	public List<String> findAllCountryNames();
}
