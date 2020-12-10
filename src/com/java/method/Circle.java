package com.java.method;

public class Circle {
	
	//Write a program to print the circumference and area of a circle of
	//radius entered by user by defining your own method.
	
	public double circumference(double radius)
	{
		System.out.println("The radius of the circle is :"+ radius);
		double circum = 2 * Math.PI * radius;
		return circum;
	}

	public double area(double radius)
	{
		System.out.println("The radius of the circle is :"+ radius);
		double area = Math.PI * radius * radius;
		return area;
	}

	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		double d1 = c.area(2);
		System.out.println("The Area of the circle is:" + d1);
		System.out.println("-----------------------------------------------");
		double d2 = c.circumference(5);
		System.out.println("The Circumference of the circle is:" + d2);

		


		
	}

}
