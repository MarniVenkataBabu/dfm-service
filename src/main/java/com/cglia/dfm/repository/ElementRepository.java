package com.cglia.dfm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.dfm.entity.Element;

@Repository
public interface ElementRepository extends JpaRepository<Element, Long> {

	Element findByName(String elementName);
}
