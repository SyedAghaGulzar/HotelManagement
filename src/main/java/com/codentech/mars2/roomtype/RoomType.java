package com.codentech.mars2.roomtype;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

@Entity
public class RoomType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String type;
	
	private String description;
	
	private Integer singleRooms;
	
	private Integer doubleRooms;
	
	private Integer tripleRooms;
	
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getSingleRooms() {
		return singleRooms;
	}

	public void setSingleRooms(int singleRooms) {
		this.singleRooms = singleRooms;
	}

	public int getDoubleRooms() {
		return doubleRooms;
	}

	public void setDoubleRooms(int doubleRooms) {
		this.doubleRooms = doubleRooms;
	}

	public int getTripleRooms() {
		return tripleRooms;
	}

	public void setTripleRooms(int tripleRooms) {
		this.tripleRooms = tripleRooms;
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
		return "RoomType [id=" + id + ", type=" + type + ", description=" + description + ", singleRooms=" + singleRooms
				+ ", doubleRooms=" + doubleRooms + ", tripleRooms=" + tripleRooms + ", isActive=" + isActive
				+ ", isDeleted=" + isDeleted + "]";
	}
	
}
