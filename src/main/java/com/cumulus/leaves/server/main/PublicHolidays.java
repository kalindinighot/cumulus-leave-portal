package com.cumulus.leaves.server.main;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name ="public_holidays" ) 
public class PublicHolidays  
{
	Integer holidayId;
	String description;
	LocalDate holidayDate;
	
	public PublicHolidays() {
		System.out.println("Inside PublicHolidays pojo constructor");
	}

	@Id
	@Column( name = "holiday_id" )
	public Integer getHolidayId() {
		return holidayId;
	}

	public void setHolidayId(Integer holidayId) {
		this.holidayId = holidayId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column( name = "holiday_date" )
	public LocalDate getHolidayDate() {
		return holidayDate;
	}

	public void setHolidayDate(LocalDate holidayDate) {
		this.holidayDate = holidayDate;
	}

	@Override
	public String toString() {
		return "PublicHolidays [holidayId=" + holidayId + ", description=" + description + ", holidayDate="
				+ holidayDate + "]";
	}
	
	
}
