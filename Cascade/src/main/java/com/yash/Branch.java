package com.yash;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String loc;
	private int noOfDoc;
	@ManyToOne
	@JoinColumn
	private Hospital hospitals;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public int getNoOfDoc() {
		return noOfDoc;
	}
	public void setNoOfDoc(int noOfDoc) {
		this.noOfDoc = noOfDoc;
	}
	public Hospital getHospitals() {
		return hospitals;
	}
	public void setHospitals(Hospital hospitals) {
		this.hospitals = hospitals;
	}
	
}
