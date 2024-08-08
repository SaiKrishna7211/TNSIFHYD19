package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String collegeName;
	private String location;
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College(long id, String collegeName, String location) {
		super();
		this.id = id;
		this.collegeName = collegeName;
		this.location = location;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "College [id=" + id + ", collegeName=" + collegeName + ", location=" + location + "]";
	}
	
}
