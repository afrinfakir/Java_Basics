package com.java.method;

public class Factorial {
	// Write a program to print the factorial of a number by defining a method

	public void fact(int num) {
		System.out.println("Please enter the number : " + num);

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of " + num + " " + "is" + " " + fact);

	}

	public static void main(String[] args) {

		Factorial f = new Factorial();
		f.fact(0);
		f.fact(1);
		f.fact(5);

	}

}
