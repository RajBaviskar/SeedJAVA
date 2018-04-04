package com.company;
import com.company.MyDate;

public class Lab9Main {

	public static void swaps(MyDate date_one, MyDate date_two) {
		MyDate temp;
		temp = date_one;
		date_one = date_two;
		date_two = temp;
		System.out.println("Inside Swap Dates");
		date_one.displayDate();
		date_two.displayDate();
		System.out.println(" ******");
	}

	public static void swapInt(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Inside swapInt");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(" **** ");
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		swapInt(10,20);
		System.out.println("a = " + a);
		System.out.println("b = " + b);


		MyDate birthday = new MyDate(20,07,1987);
		MyDate aniversary = new MyDate(24,12,2015);
		birthday.displayDate();
		aniversary.displayDate();
		swaps(birthday,aniversary);
		birthday.displayDate();
		aniversary.displayDate();
	}
}