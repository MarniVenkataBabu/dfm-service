package com.cglia.dfm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.dfm.service.CountryCodesService;
import com.cglia.dfm.service.FormSavedJsonService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class CountryCodesController {

	private CountryCodesService countryCodesService;
	private FormSavedJsonService formService;

	@GetMapping("/getAllCountryNames")
	public List<String> getAllCountryName() {
		return countryCodesService.getAllCountryNames();
	}

	@GetMapping("/getAllCountryCodes")
	public List<String> getAllCountryCodes() {
		return countryCodesService.getAllCountryCodes();
	}

	@GetMapping("/findAllCountryNames")
	public List<String> findAllCountryNames() {
		return countryCodesService.findAllCountryNames();
	}
	
	 @GetMapping("/getLocationData")
	    public ResponseEntity<Map<String, List<Map<String, String>>>> getLocationData() {
	        Map<String, List<Map<String, String>>> response = new HashMap<>();

	        List<Map<String, String>> countries = new ArrayList<>();
	        countries.add(Map.of("key", "IN", "value", "India"));
	        countries.add(Map.of("key", "US", "value", "United States of America"));
	        countries.add(Map.of("key", "US", "value", "United States of America"));
	        countries.add(Map.of("key", "US", "value", "United States of America"));
	        countries.add(Map.of("key", "US", "value", "United States of America"));
	        response.put("country", countries);

	        List<Map<String, String>> states = new ArrayList<>();
	        states.add(Map.of("id", "AP", "name", "Andhra Pradesh"));
	        states.add(Map.of("id", "UP", "name", "Uttar Pradesh"));
	        states.add(Map.of("id", "MP", "name", "Madhya Pradesh"));
	        states.add(Map.of("id", "HP", "name", "Himachal Pradesh"));
	        response.put("state", states);

	        List<Map<String, String>> districts = new ArrayList<>();
	        districts.add(Map.of("option", "Guntur", "response", "guntur"));
	        districts.add(Map.of("option", "Prakasam", "response", "prakasam"));
	        districts.add(Map.of("option", "Krishna", "response", "Krishna"));
	        districts.add(Map.of("option", "Chitoor", "response", "chitoor"));
	        response.put("district", districts);

	        return ResponseEntity.ok(response);
	    }

	
}
