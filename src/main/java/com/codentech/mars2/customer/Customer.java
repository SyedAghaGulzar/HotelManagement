package com.codentech.mars2.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

import com.codentech.mars2.enumeration.CustomerType;
import com.codentech.mars2.enumeration.Gender;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Customer {

	public static final String ROOT_NODE="customer__";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private CustomerType customerType;

	private String cnic;
	
	@Column(columnDefinition="varchar(50)")
	private String name;

	@Column(columnDefinition="varchar(20)")
	private String phone;

	private String fax; // varchar length decision pending

	@Column(columnDefinition="varchar(50)")
	private String email;
	
	private String address;
	
	@Column(columnDefinition="varchar(30)")
	private String city;

	@Column(columnDefinition="varchar(30)")
	private String state;

	@Column(columnDefinition="varchar(20)")
	private String zip;

	@Column(columnDefinition="varchar(30)")
	private String country;

	private Gender gender;

	@Column(columnDefinition="text")
	private String notes;
	
	@Column(columnDefinition="varchar(20)")
	private String cDesignation;
	
	@Column(columnDefinition="varchar(50)")
	private String cContactPerson;

	@JsonIgnore
	@Type(type = "yes_no")
	private Boolean isDeleted;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CustomerType getCustomerType () {
		return customerType;
	}

	public void setCustomerType(CustomerType type) {
		this.customerType = type;
	}

	public String getCnic() {
		return cnic;
	}

	public void setCnic(String cnic) {
		this.cnic = cnic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return phone;
	}

	public void setMobile(String mobile) {
		this.phone = mobile;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getCDesignation() {
		return cDesignation;
	}

	public void setCDesignation(String designation) {
		this.cDesignation = designation;
	}

	public String getCContactPerson() {
		return cContactPerson;
	}

	public void setCContactPerson(String contactPerson) {
		this.cContactPerson = contactPerson;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
