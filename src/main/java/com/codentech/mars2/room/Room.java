package com.codentech.mars2.room;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Type;

import com.codentech.mars2.roomtype.RoomType;

@Entity
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_generator")
	@SequenceGenerator(name="room_generator", sequenceName = "room_seq",initialValue=1, allocationSize=1)
	@Column(name="id",nullable=false,updatable=false)
	private Integer id;
	
	private String number;
	
	private String floor;
	
	private RoomType type; 
	
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

	public RoomType getType() {
		return type;
	}

	public void setType(RoomType type) {
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


}
