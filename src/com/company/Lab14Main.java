package com.company;

import com.company.Circle;
import com.company.Rectangle;

public class Lab14Main {

	public static void displayArea(Shape anyShape) {
		System.out.println(anyShape.area());
	}

	public static void main (String[] args) {
		Shape rectangle = new Shape();
		Shape rectangle = new Rectangle(10, 20);
		Shape circle = new Circle(3);
		displayArea(rectangle);
		displayArea(circle);
	}
}