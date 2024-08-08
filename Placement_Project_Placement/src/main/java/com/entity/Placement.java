package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Placement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	private String qualification;
	private int year;
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Placement(long id, String name, String qualification, int year) {
		super();
		this.id = id;
		this.name = name;
		this.qualification = qualification;
		this.year = year;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", qualification=" + qualification + ", year=" + year + "]";
	}
	
}
