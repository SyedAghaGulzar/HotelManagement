package com.codentech.mars2.employee;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;

	private String login;

	private String name;
	
	private String fatherName;

	private String workMobile;
	
	private String homeMobile;

	private String address;

	private String city;

	private String state;

	private String zip;

	private String country;

	private String gender;

	private String notes;
	
	private String religion;
	
	private String married;
	
	private String designation;
	
	private boolean sales;
	
    private LocalDate startDate;
	
	private LocalDate endDate;

	private LocalDate blockDate;
	
    private String ssn;
    
    private LocalDate dob;
    
    private int payPeriod;
    
    private String restrictDepartment;
    
    private String restrictWarehouse;
    
    private String restrictAccounts;
    
    private String restrictGroups;
    
    private String shift;
    
    private String cnic;

	@Type(type = "yes_no")
	private Boolean isDeleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getWorkMobile() {
		return workMobile;
	}

	public void setWorkMobile(String workMobile) {
		this.workMobile = workMobile;
	}

	public String getHomeMobile() {
		return homeMobile;
	}

	public void setHomeMobile(String homeMobile) {
		this.homeMobile = homeMobile;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getMarried() {
		return married;
	}

	public void setMarried(String married) {
		this.married = married;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public boolean isSales() {
		return sales;
	}

	public void setSales(boolean sales) {
		this.sales = sales;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public LocalDate getBlockDate() {
		return blockDate;
	}

	public void setBlockDate(LocalDate blockDate) {
		this.blockDate = blockDate;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public int getPayPeriod() {
		return payPeriod;
	}

	public void setPayPeriod(int payPeriod) {
		this.payPeriod = payPeriod;
	}

	public String getRestrictDepartment() {
		return restrictDepartment;
	}

	public void setRestrictDepartment(String restrictDepartment) {
		this.restrictDepartment = restrictDepartment;
	}

	public String getRestrictWarehouse() {
		return restrictWarehouse;
	}

	public void setRestrictWarehouse(String restrictWarehouse) {
		this.restrictWarehouse = restrictWarehouse;
	}

	public String getRestrictAccounts() {
		return restrictAccounts;
	}

	public void setRestrictAccounts(String restrictAccounts) {
		this.restrictAccounts = restrictAccounts;
	}

	public String getRestrictGroups() {
		return restrictGroups;
	}

	public void setRestrictGroups(String restrictGroups) {
		this.restrictGroups = restrictGroups;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public String getCnic() {
		return cnic;
	}

	public void setCnic(String cnic) {
		this.cnic = cnic;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", login=" + login + ", name=" + name + ", fatherName=" + fatherName
				+ ", workMobile=" + workMobile + ", homeMobile=" + homeMobile + ", address=" + address + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", country=" + country + ", gender=" + gender
				+ ", notes=" + notes + ", religion=" + religion + ", married=" + married + ", designation="
				+ designation + ", sales=" + sales + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", blockDate=" + blockDate + ", ssn=" + ssn + ", dob=" + dob + ", payPeriod=" + payPeriod
				+ ", restrictDepartment=" + restrictDepartment + ", restrictWarehouse=" + restrictWarehouse
				+ ", restrictAccounts=" + restrictAccounts + ", restrictGroups=" + restrictGroups + ", shift=" + shift
				+ ", cnic=" + cnic + ", isDeleted=" + isDeleted + "]";
	}
	
	

}
