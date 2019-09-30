package com.cumulus.leaves.server.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name ="leave_category" )
public class LeaveCategory 
{
	Integer leaveCategoryId;
	String leaveCategoryName;
	int allotedDays;
	int minDays;
	int updateIntervalInMonths;
	int incrementInDays;
	
	public LeaveCategory() {
		System.out.println("Inside LeaveCategory pojo constructor.");
	}
	
	@Id
	@Column( name= "leave_category_id" )
	public Integer getLeaveCategoryId() {
		return leaveCategoryId;
	}
	public void setLeaveCategoryId(Integer leaveCategoryId) {
		this.leaveCategoryId = leaveCategoryId;
	}
	
	@Column( name = "leave_category_name" )
	public String getLeaveCategoryName() {
		return leaveCategoryName;
	}
	public void setLeaveCategoryName(String leaveCategoryName) {
		this.leaveCategoryName = leaveCategoryName;
	}
	
	@Column( name = "alloted_days" )
	public int getAllotedDays() {
		return allotedDays;
	}
	public void setAllotedDays(int allotedDays) {
		this.allotedDays = allotedDays;
	}
	
	@Column( name = "min_days" )
	public int getMinDays() {
		return minDays;
	}
	public void setMinDays(int minDays) {
		this.minDays = minDays;
	}
	
	@Column( name = "update_interval_in_months" )
	public int getUpdateIntervalInMonths() {
		return updateIntervalInMonths;
	}
	public void setUpdateIntervalInMonths(int updateIntervalInMonths) {
		this.updateIntervalInMonths = updateIntervalInMonths;
	}
	
	@Column( name= "increment_in_days" )
	public int getIncrementInDays() {
		return incrementInDays;
	}
	public void setIncrementInDays(int incrementInDays) {
		this.incrementInDays = incrementInDays;
	}

	@Override
	public String toString() {
		return "LeaveCategory [leaveCategoryId=" + leaveCategoryId + ", leaveCategoryName=" + leaveCategoryName
				+ ", allotedDays=" + allotedDays + ", minDays=" + minDays + ", updateIntervalInMonths="
				+ updateIntervalInMonths + ", incrementInDays=" + incrementInDays + "]";
	}
	
	
	
	
}
