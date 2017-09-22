package com.codentech.mars2.reservation;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Type;

import com.codentech.mars2.customer.Customer;
import com.codentech.mars2.room.Room;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Reservation {

	public static final String ROOT_NODE="reservation__";
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private Integer roomId; 
	
	private Double roomRate;
	
	private Long customerId;
	
	@Transient
	@JsonIgnore
	private Customer __customer;

	private String resStatus;
	
	private LocalDate resDate;
	
	private LocalDate checkIn;

	private LocalDate checkout;
	
	private int noOfGuests;
	
	private String guestInfo;
	
	private String stayPurpose;
	
	private String referenceCompany;
	
	private Boolean pickup;
	
	private String pickFrom;
	
	private String pickCareer;
	
	private Boolean drop;

	private String dropFrom;
	
	private String dropCareer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRoomId() {
		return roomId;
	}

	public void setRoomId(Integer roomId) {
		this.roomId = roomId;
	}

	public Double getRoomRate() {
		return roomRate;
	}

	public void setRoomRate(Double roomRate) {
		this.roomRate = roomRate;
	}

	@JsonProperty
	@JsonInclude(JsonInclude.Include.NON_EMPTY)
	public Long getCustomerId() {
		return customerId;
	}

	@JsonIgnore
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	
	public Customer get__customer() {
		return __customer;
	}
	
	public void set__customer(Customer __customer) {
		this.__customer = __customer;
	}

	public String getResStatus() {
		return resStatus;
	}

	public void setResStatus(String resStatus) {
		this.resStatus = resStatus;
	}

	public LocalDate getResDate() {
		return resDate;
	}

	public void setResDate(LocalDate resDate) {
		this.resDate = resDate;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(LocalDate checkIn) {
		this.checkIn = checkIn;
	}

	public LocalDate getCheckout() {
		return checkout;
	}

	public void setCheckout(LocalDate checkout) {
		this.checkout = checkout;
	}

	public int getNoOfGuests() {
		return noOfGuests;
	}

	public void setNoOfGuests(int noOfGuests) {
		this.noOfGuests = noOfGuests;
	}

	public String getGuestInfo() {
		return guestInfo;
	}

	public void setGuestInfo(String guestInfo) {
		this.guestInfo = guestInfo;
	}

	public String getStayPurpose() {
		return stayPurpose;
	}

	public void setStayPurpose(String stayPurpose) {
		this.stayPurpose = stayPurpose;
	}

	public String getReferenceCompany() {
		return referenceCompany;
	}

	public void setReferenceCompany(String referenceCompany) {
		this.referenceCompany = referenceCompany;
	}

	public Boolean getPickup() {
		return pickup;
	}

	public void setPickup(Boolean pickup) {
		this.pickup = pickup;
	}

	public String getPickFrom() {
		return pickFrom;
	}

	public void setPickFrom(String pickFrom) {
		this.pickFrom = pickFrom;
	}

	public String getPickCareer() {
		return pickCareer;
	}

	public void setPickCareer(String pickCareer) {
		this.pickCareer = pickCareer;
	}

	public Boolean getDrop() {
		return drop;
	}

	public void setDrop(Boolean drop) {
		this.drop = drop;
	}

	public String getDropFrom() {
		return dropFrom;
	}

	public void setDropFrom(String dropFrom) {
		this.dropFrom = dropFrom;
	}

	public String getDropCareer() {
		return dropCareer;
	}

	public void setDropCareer(String dropCareer) {
		this.dropCareer = dropCareer;
	}
	
}