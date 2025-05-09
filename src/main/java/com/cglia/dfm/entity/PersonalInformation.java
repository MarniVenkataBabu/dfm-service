package com.cglia.dfm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name="personal_information")
public class PersonalInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private String id;
	
	@Column(name = "FIRST_NAME")
	private String firstName ;
	
	@Column(name = "LAST_NAME")
	private String lastName ;
	
	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress ;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber; 
	
	@Column(name = "ALTERNATE_MOBILE")
	private String alternateMobile;
	
	@Column(name = "FIELD_OF_STUDY")
	private String fieldOfStudy ;

	@Column(name = "US_CITIZEN")
	private String usCitizen ;
	
	@Column(name = "GENDER")
	private String gender ;
	
	@Column(name = "ADDRESS")
	private String address ;
	
	@Column(name = "WORKING_EMAIL")
	private String workingEmail; 
	
	@Column(name = "COUNTRY")
	private String country ;
	
	@Column(name = "STATE")
	private String state ;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "PINCODE")
	private String pincode;
	
}
	