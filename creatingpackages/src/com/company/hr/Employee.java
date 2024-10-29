package com.company.hr;

public class Employee {
	
	private int empId;
	private String name;
	
	
	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	
	public String displayEmployeeDetails()
	{
		return name + " " + empId;
	}

}