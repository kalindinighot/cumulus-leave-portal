package com.cumulus.leaves.server.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Designation 
{
	Employee employee;
	Integer designationId;
	String designation;
	
	public Designation() 
	{
		System.out.println("Inside designation pojo contructor");
	}

	@Id
	@Column( name= "designation_id" )
	public Integer getDesignationId() {
		return designationId;
	}

	public void setDesignationId(Integer designationId) {
		this.designationId = designationId;
	}
	
	
	@OneToOne
	@JsonBackReference
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String deswignation) {
		this.designation = deswignation;
	}

	@Override
	public String toString() {
		return "Designation [designationId=" + designationId + ", deswignation=" + designation + "]";
	}
	
	
}
