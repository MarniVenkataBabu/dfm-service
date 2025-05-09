package com.cglia.dfm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.dfm.entity.FormSavedJSON;

@Repository
public interface FormSavedJsonRepository extends JpaRepository<FormSavedJSON, Integer>{
	public FormSavedJSON findByFormName(String formName);
}
