package com; //1. class must reside in a package

public class Employee { //2.class must be public and non final
	//3.data members must be private
	private int empId; // In Hibernate class must contain a variable that holds primary key
	private String empName;
	private String designation;
	
	public Employee() { //4. a non parameterized constructor
	}
	
	//5. must have setters and getters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	

}
