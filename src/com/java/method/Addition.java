package com.java.method;

public class Addition {

	//Write a program to print the sum of two numbers entered by user by 
	//defining your own method.
	
	public double sum (double a,double b) {
		
		System.out.println("The first number is : " + a);
		System.out.println("The second number is : " + b);
		
		double c=a+b;
		return c;
		}
	
	public static void main(String[] args) {
		
		Addition add =new Addition();
		
		double d=add.sum(23.4666, 12.333);
		
		System.out.println("The addition of given number is : " + d);

	}

}
