package com.cglia.dfm.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.cglia.dfm.entity.CountryCodes;
import com.cglia.dfm.repository.CountryCodesRepository;
import com.cglia.dfm.service.CountryCodesService;
import com.fasterxml.jackson.databind.JsonNode;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CountryCodesServiceImpl implements CountryCodesService{
	
	private CountryCodesRepository countryCodesRepository;
	
	private final RestClient restClient;

	@Override
	public List<String> getAllCountryNames() {
		return countryCodesRepository.findAll().stream().map(CountryCodes :: getCountryName).toList();
	}

	@Override
	public List<String> getAllCountryCodes() {
		return countryCodesRepository.findAll().stream().map(CountryCodes :: getCountryCode).toList();
	}
	
	@Override
	public List<String> findAllCountryNames(){
		String url = "https://restcountries.com/v3.1/all";
		JsonNode[] countryArray = restClient.get()
				.uri(url)
				.retrieve()
				.body(JsonNode[].class);
		return Stream.ofNullable(countryArray)
				.flatMap(Stream :: of)
				.map(jsonNode -> jsonNode.path("name").path("common").asText())
				.filter(code -> code != null && !code.isEmpty())
				.distinct()
				.sorted()
				.toList();
	}
	
}
