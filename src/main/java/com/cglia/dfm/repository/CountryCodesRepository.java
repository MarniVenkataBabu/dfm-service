package com.cglia.dfm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.dfm.entity.CountryCodes;

@Repository
public interface CountryCodesRepository extends JpaRepository<CountryCodes, Integer> {

}
