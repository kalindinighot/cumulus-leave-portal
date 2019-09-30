package com.cumulus.leaves.server.main;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Login 
{
	
	Integer empId;
	Employee employee;
	String password;
	
	public Login() {
		System.out.println("Inside Login pojo constructor.");
	}
	
	@Id
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}


	@OneToOne
	@JoinColumn( name = "emp_id" )
	@MapsId
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [empolyee=" + employee + ", password=" + password + "]";
	}
	
	
}
