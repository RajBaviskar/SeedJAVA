package com.company;
import com.company.MyDate;

public class Employee {

	private static long totalEmployee = 0;
	MyDate joiningDate;

	private long employeeId;
	private String employeeName = "";
	protected double basicSalary;
	private double HRA;
	private double medical;
	private double PF;
	private double PT;
	private double grossSalary;
	private double netSalary;

	public Employee() {
		totalEmployee++;
		joiningDate = new MyDate();
		this.employeeId = 0;
		this.employeeName = "";
		this.basicSalary = 0;
		this.HRA = 0.5 * basicSalary;
		this.medical = 0;
		this.PF = 0.12 * basicSalary;
		this.PT = 200;
		this.grossSalary = basicSalary + HRA + medical;
		this.netSalary = grossSalary - (PT + PF);
	}

	public Employee (final long employeeId, final String employeeName,
		final double basicSalary, final double medical,final int day,
		final int month, final int year) {
		totalEmployee++;
		joiningDate = new MyDate(day, month, year);
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.HRA = 0.5 * basicSalary;
		this.medical = medical;
		this.PF = 0.12 * basicSalary;
		this.PT = 200;
		this.grossSalary = basicSalary + HRA + medical;
		this.netSalary = grossSalary - (PT + PF);
	}

	public static long totalEmployee() {
		return totalEmployee;
	}

	public void setEmployeeId (final long employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName (final String employeeName) {
		this.employeeName = employeeName;
	}
	public void setBasicSalary (final double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public void setMedical (final double medical ) {
		this.medical = medical;
	}

	public long getEmployeeId() {
		return this.employeeId;
	}

	public String getEmployeeName() {
		return this.employeeName ;
	}

	public double getBasicSalary() {
		return this.basicSalary;
	}

	public double getHRA() {
		return this.HRA ;
	}

	public double getMedical () {
		return this.medical;
	}

	public double getPF () {
		return this.PF;
	}

	public double getPT() {
		return this.PT;
	}

	public double getNetSalary() {
		return this.netSalary;
	}

	public double getGrossSalary() {
		return this.grossSalary;
	}

	public String toString() {
		joiningDate.displayDate();
		return "EmployeeId = " + employeeId + "\n" 
		+ "Employee Name = " + employeeName + "\n"
		+ "Basic Salary = " + basicSalary + "\n"
		+ "HRA = " + HRA + "\n"
		+ "Medical = " + medical + "\n"
		+ "PF = " + PF + "\n"
		+ "PT = " + PT + "\n"
		+ "Net Salary = " + netSalary + "\n"
		+ "Gross Salary = " + grossSalary + "\n";
	}
}