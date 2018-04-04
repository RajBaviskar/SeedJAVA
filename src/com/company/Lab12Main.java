package com.company;

import com.company.Manager;
import com.company.MarketingExecutive;

public class Lab12Main {

	public static void showDetails(final Employee employee) {
		System.out.println(employee.toString());
	}

	public static void main (String[] args) {
		Manager Varol = new Manager(34746, "Varol", 85000, 500, 6, 8, 2014);
		//System.out.println(Varol.toString());
		showDetails(Varol);
		System.out.println("NetSalary = " + Varol.getNetSalary());

		MarketingExecutive Cameron = new MarketingExecutive(9211, "Cameron", 150000, 500, 6, 10, 2001, 100);
		//System.out.println(Cameron.toString());
		showDetails(Cameron);
		System.out.println("NetSalary = " + Cameron.getNetSalary());
	}
}