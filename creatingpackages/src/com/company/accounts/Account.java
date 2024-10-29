package com.company.accounts;

public class Account {
	
	private int accId;
	private String name;
	
	
	public Account(int accId, String name) {
		super();
		this.accId = accId;
		this.name = name;
	}
	
	public String displayAccountDetails()
	{
		return name + " " + accId;
	}
	
	

}
