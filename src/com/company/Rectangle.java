package com.company;

import com.company.Shape;

public class Rectangle extends Shape{
	double width;
	double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public double area() {
		return width * length;
	}
}