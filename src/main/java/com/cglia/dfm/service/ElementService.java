package com.cglia.dfm.service;

import java.util.List;

import com.cglia.dfm.dto.ElementDTO;
import com.cglia.dfm.entity.Element;
import com.cglia.dfm.entity.Property;

public interface ElementService {
	
	public List<Element> getAllElements();
	
	public List<String> getAllElementNames();
	
	public Element getElementProperties(String elementName);

	ElementDTO getElementById(String elementName);

}
