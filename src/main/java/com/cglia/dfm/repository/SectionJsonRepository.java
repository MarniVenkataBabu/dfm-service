package com.cglia.dfm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.dfm.entity.SectionJSON;

@Repository
public interface SectionJsonRepository extends JpaRepository<SectionJSON, Integer>{

}
