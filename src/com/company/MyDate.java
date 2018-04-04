package com.company; 

public class MyDate {
	private long day;
	private long month;
	private long year;

	public MyDate() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}

    public MyDate(final long day, final long month, final long year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public void displayDate() {
		System.out.println("***************");
		System.out.println(day + "/" + month + "/" + year);
	}

	public void setDay(final long day) {
		this.day = day;
	}

	public void setMonth(final long day) {
		this.day = day;
	}

	public void setYear(final long day) {
		this.day = day;
	}

	public long getDay() {
		return this.day;
	}

	public long getMonth() {
		return this.month;
	}

	public long getYear() {
		return this.year;
	}
}