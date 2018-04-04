package com.company;

import com.company.Employee;

public class MarketingExecutive extends Employee {
	double Kilometers;
	double TA;
	double MA;

	public MarketingExecutive(final long employeeId, final String employeeName,
		final double basicSalary, final double medical,final int day,
		final int month, final int year, final double Kilometers) {
		super(employeeId, employeeName, basicSalary, medical, day, month, year);
		this.Kilometers = Kilometers;
		this.TA = 5 * Kilometers;
		this.MA = 1500;
	}

	public double getNetSalary() {
		return super.getNetSalary() + this.TA + this.MA;
 	}

	public String toString() {
		return super.toString() + 
		"Kilometers = " + this.Kilometers + "\n" + 
		"TA = " + this.TA + "\n" + 
		"MA = " + this.MA;
	}
}