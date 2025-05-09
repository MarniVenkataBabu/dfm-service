package com.cglia.dfm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cglia.dfm.entity.PersonalInformation;

@Repository
public interface PersonalInformationRepository extends JpaRepository<PersonalInformation, Integer>{

	
	@Query("SELECT p FROM PersonalInformation p WHERE LOWER(p.firstName) LIKE LOWER(CONCAT('%', :name, '%'))")
	List<PersonalInformation> searchByFirstName(@Param("name") String name);

}
