package com.company;
import com.company.Employee;

public class Lab2Main {
	public static void main(String[] args) {
		Employee engineerOne = new Employee();
		System.out.println(engineerOne);

		Employee engineerTwo = new Employee(34746, "Rajesh", 85000, 500);
		System.out.println(engineerTwo);
	}
}