package com.codentech.mars2.room.type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class RoomType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(columnDefinition="varchar(20)")
	private String name;
	
	@Column(columnDefinition="text")
	private String description;
	
	@Type(type="yes_no")
	@Column(columnDefinition="char default 'Y'")
	private boolean isActive;
	
	@Type(type="yes_no")
	@Column(columnDefinition="char default 'N'")
	@JsonIgnore
	private boolean isDeleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return name;
	}

	public void setType(String type) {
		this.name = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		return "RoomType [id=" + id + ", type=" + name + ", description=" + description + ", isActive=" + isActive
				+ ", isDeleted=" + isDeleted + "]";
	}
	
}
