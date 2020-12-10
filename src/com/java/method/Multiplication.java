package com.java.method;

public class Multiplication {
	// Define a method that returns the product of two numbers entered by user.

	public int prod(int x, int y) {

		System.out.println("The first number is : " + x);
		System.out.println("The second number is : " + y);

		int z = x * y;
		return z;
	}

	public static void main(String[] args) {

		Multiplication m = new Multiplication();

		int product = m.prod(23, 10);

		System.out.println("The product of given number is : " + product);

	}

}
