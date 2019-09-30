package com.cumulus.leaves.server.main;

import java.sql.Blob;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table( name = "leave_record" )
public class LeaveRecord 
{
	Integer leaveAppId;
	Employee employee;
	LocalDate startDate;
	LocalDate endDate;
	Timestamp appliedTime;
	String reason;
	Blob medicalCertificate;
	String status;
	LeaveCategory leaveCategory;
	String remark;
	int noOfDays;
	
	public LeaveRecord() {
		System.out.println( "Inside leaveRecord pojo constructor" );
	}

	@Id
	@Column( name= "leave_app_id" )
	public Integer getLeaveAppId() {
		return leaveAppId;
	}

	public void setLeaveAppId(Integer leaveAppId) {
		this.leaveAppId = leaveAppId;
	}

	@ManyToOne
	@JoinColumn( name = "emp_id" )
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Column( name = "start_date" )
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	@Column( name = "end_date" )
	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	@Column( name = "applied_time" )
	public Timestamp getAppliedTime() {
		return appliedTime;
	}

	public void setAppliedTime(Timestamp appliedTime) {
		this.appliedTime = appliedTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Column( name = "medical_certificate" )
	public Blob getMedicalCertificate() {
		return medicalCertificate;
	}

	public void setMedicalCertificate(Blob medicalCertificate) {
		this.medicalCertificate = medicalCertificate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToOne
	@JoinColumn( name = "leave_category_id" )
	public LeaveCategory getLeaveCategory() {
		return leaveCategory;
	}

	public void setLeaveCategory(LeaveCategory leaveCategory) {
		this.leaveCategory = leaveCategory;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Column( name = "no_of_days" )
	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "LeaveRecord [leaveAppId=" + leaveAppId + ", employee=" + employee + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", appliedTime=" + appliedTime + ", reason=" + reason
				+ ", medicalCertificate=" + medicalCertificate + ", status=" + status + ", leaveCategory="
				+ leaveCategory + ", remark=" + remark + ", noOfDays=" + noOfDays + "]";
	}
	
	
	
	
}
