package com.restapi4.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "employee")
public class OfficeEntity {
	@Id
	@Column(name = "employeeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "empName")
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	  @JoinColumn(name = "e_id")
	private EmpInformation empInfo;
	public OfficeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public EmpInformation getEmpInfo() {
		return empInfo;
	}
	public void setEmpInfo(EmpInformation empInfo) {
		this.empInfo = empInfo;
	}
	
	

}
