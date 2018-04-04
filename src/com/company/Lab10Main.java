package com.company;
import com.company.Employee;

public class Lab10Main {
	public static void main(String[] args) {	
		Employee engineerOne = new Employee();
		System.out.println(engineerOne);
		System.out.println(engineerOne.totalEmployee());

		Employee engineerTwo = new Employee(34746, "Rajesh", 85000, 500, 6, 8, 2014);
		System.out.println(engineerTwo);
		System.out.println(engineerTwo.totalEmployee());	
	}
}