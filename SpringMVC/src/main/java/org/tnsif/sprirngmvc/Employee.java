package org.tnsif.sprirngmvc;

import org.springframework.stereotype.Component;

@Component //
public class Employee {
	private int empID;
	private String empname;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public void print()
	{
		System.out.println("Employee belongs to IT Department");
		System.out.println("EmpId : "+ empID + " EmployeeName : "+empname);
	}
	

}
