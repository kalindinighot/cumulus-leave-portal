package com.cumulus.leaves.server.main;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Employee
{
	Integer empId;
	String empName;
	String mobileNo;
	String emailId;
	char gender;
	String role;
	Designation designation;
	LocalDate joiningDate;
	LocalDate relieveDate;
	LeaveCard leaveCard;
	Employee managerId;
	
	@OneToOne
	@JoinColumn( name = "manager_id" )
	public Employee getManagerId() {
		return managerId;
	}

	public void setManagerId(Employee managerId) {
		this.managerId = managerId;
	}

	public Employee() {
		System.out.println("Inside employee pojo constructor");
	}

	@Id
	@Column( name = "emp_id" )
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Embedded
	public LeaveCard getLeaveCard() {
		return leaveCard;
	}

	public void setLeaveCard(LeaveCard leaveCard) {
		this.leaveCard = leaveCard;
	}

	@Column( name = "emp_name" )
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Column( name = "mobile_no" )
	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Column( name = "email_id" )
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@OneToOne
	@JsonManagedReference
	@JoinColumn( name = "designation_id" )
	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	@Column( name= "joining_date" )
	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Column( name = "relieve_date" )
	public LocalDate getRelieveDate() {
		return relieveDate;
	}

	public void setRelieveDate(LocalDate relieveDate) {
		this.relieveDate = relieveDate;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", mobileNo=" + mobileNo + ", emailId=" + emailId
				+ ", gender=" + gender + ", role=" + role + ", designation=" + designation + ", joiningDate="
				+ joiningDate + ", relieveDate=" + relieveDate + ", getEmpId()=" + getEmpId() + ", getEmpName()="
				+ getEmpName() + ", getMobileNo()=" + getMobileNo() + ", getEmailId()=" + getEmailId()
				+ ", getGender()=" + getGender() + ", getRole()=" + getRole() + ", getDesignation()=" + getDesignation()
				+ ", getJoiningDate()=" + getJoiningDate() + ", getRelieveDate()=" + getRelieveDate() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
