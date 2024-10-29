package com.company;

import com.company.accounts.Account;
import com.company.hr.Employee;

public class CompanyTest {
	
	public static void main(String[] args) {
		Employee e = new Employee(123, "vijay");
		System.out.println(" employee details: " +e.displayEmployeeDetails());
		
		Account a = new Account(12, "pramodh");
		System.out.println("Account details: "+ a.displayAccountDetails());
	}

}
