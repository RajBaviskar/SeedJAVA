package com.company;

import com.company.Employee;

public class Manager extends Employee {
	double PA;
	double FA;
	double OA;

	public Manager(final long employeeId, final String employeeName,
		final double basicSalary, final double medical,final int day,
		final int month, final int year) {
		super(employeeId, employeeName, basicSalary, medical, day, month, year);
		this.PA = 0.08 * basicSalary;
		this.FA = 0.13 * basicSalary;
		this.OA = 0.03* basicSalary;
	}

	public double getNetSalary() {
		return super.getNetSalary() + this.PA + this.FA + this.OA;
 	}

	public String toString () {
		return super.toString() + 
		"PA = " + this.PA + "\n" +
		"FA = " + this.FA + "\n" +
		"OA = " + this.OA;
	}
}
