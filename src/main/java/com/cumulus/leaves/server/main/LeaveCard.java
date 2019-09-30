package com.cumulus.leaves.server.main;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class LeaveCard 
{
	Integer paternityLeaveCount;
	boolean maternityLeaveCount;
	double medicalLeaveCount;
	int privilegedLeaveCount;
	
	public LeaveCard() {
		System.out.println("Inside leave card pojo constructor.");
	}

	@Column(name = "paternity_leave_count" )
	public Integer getPaternityLeaveCount() {
		return paternityLeaveCount;
	}

	public void setPaternityLeaveCount(Integer paternityLeaveCount) {
		this.paternityLeaveCount = paternityLeaveCount;
	}

	@Column( name = "maternity_leave_count" )
	public boolean getMaternityLeaveCount() {
		return maternityLeaveCount;
	}

	public void setMaternityLeaveCount(boolean maternityLeaveCount) {
		this.maternityLeaveCount = maternityLeaveCount;
	}

	@Column( name = "medical_leave_count" )
	public double getMedicalLeaveCount() {
		return medicalLeaveCount;
	}

	public void setMedicalLeaveCount(double medicalLeaveCount) {
		this.medicalLeaveCount = medicalLeaveCount;
	}

	@Column( name = "privileged_leave_count" )
	public int getPrivilegedLeaveCount() {
		return privilegedLeaveCount;
	}

	public void setPrivilegedLeaveCount(int privilegedLeaveCount) {
		this.privilegedLeaveCount = privilegedLeaveCount;
	}

	@Override
	public String toString() {
		return "LeaveCard [paternityLeaveCount=" + paternityLeaveCount + ", maternityLeaveCount=" + maternityLeaveCount
				+ ", medicalLeaveCount=" + medicalLeaveCount + ", privilegedLeaveCount=" + privilegedLeaveCount + "]";
	}

}
