package com.restapi4.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "empInfo")
public class EmpInformation {
   @Id
   @Column(name = "regId")
   @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
   @Column(name = "cityName")
   private String city;
   @Column(name = "postName")
   private String postName;
  
public EmpInformation() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getPostName() {
	return postName;
}
public void setPostName(String postName) {
	this.postName = postName;
}
   
   
   
   
}
