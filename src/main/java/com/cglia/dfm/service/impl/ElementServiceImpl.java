package com.cglia.dfm.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.cglia.dfm.dto.ElementDTO;
import com.cglia.dfm.dto.PropertyDTO;
import com.cglia.dfm.entity.Element;
import com.cglia.dfm.repository.ElementRepository;
import com.cglia.dfm.repository.PropertyRepository;
import com.cglia.dfm.service.ElementService;

@Service
public class ElementServiceImpl implements ElementService{

	
	private final ElementRepository elementRepository;
	
	private final PropertyRepository propertyrepository;
	
	
	public ElementServiceImpl(ElementRepository elementRepository, PropertyRepository propertyRepository) {
		this.elementRepository = elementRepository;
		this.propertyrepository = propertyRepository;
	}

	@Override
	public List<Element> getAllElements() {
		return elementRepository.findAll();
	}

	@Override
	public List<String> getAllElementNames() {
		 return elementRepository.findAll().stream()
                .map(Element::getName)
                .toList();
	}

	@Override
	public Element getElementProperties(String elementName) {
		List property = null;	
		Element element = elementRepository.findByName(elementName);
		
		return element;
	}
	
	@Override
	public ElementDTO getElementById(String elementName) {
	    Element element = elementRepository.findByName(elementName);

	    List<PropertyDTO> propertyDTOs = element.getProperties().stream()
	                                            .map(prop -> new PropertyDTO(prop.getKey(), prop.getValue()))
	                                            .collect(Collectors.toList());

	    return new ElementDTO(element.getId(), element.getName(), element.getType(), propertyDTOs);
	}

}
