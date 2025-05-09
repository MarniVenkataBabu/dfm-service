package com.cglia.dfm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.dfm.entity.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property, Long> {
	List<Property> findAllByElementId(Long elementId);
}
