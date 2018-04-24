package com.company;

import com.company.Shape;

public class Circle extends Shape{
	double radious;

	public Circle(double radious) {
		this.radious = radious;
	}
	public double area(){
		return ( 3.14 * (radious * radious));
	}
}