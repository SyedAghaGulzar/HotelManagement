package com.codentech.mars2.room;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

@Entity
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String number;
	
	private String floor;
	
	private String type; // change String to RoomType
	
	private String status; // change String to Enum
	
	private String notes;
	
	private LocalDate lastCheckout;
	
	@Type(type="yes_no")
	private Boolean isActive;
	
	@Type(type="yes_no")
	private Boolean isDeleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public LocalDate getLastCheckout() {
		return lastCheckout;
	}

	public void setLastCheckout(LocalDate lastCheckout) {
		this.lastCheckout = lastCheckout;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", number=" + number + ", floor=" + floor + ", type=" + type + ", status=" + status
				+ ", notes=" + notes + ", lastCheckout=" + lastCheckout + ", isActive=" + isActive + ", isDeleted="
				+ isDeleted + "]";
	}

}