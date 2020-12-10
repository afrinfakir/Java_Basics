package com.java.method;

public class EvenOdd {

	// Define a program to find out whether a given number is even or odd.
	
	public void getEvenOdd(int num) {
		
		System.out.println("The given number is : "+num);
		
		if(num % 2 == 0) {
			System.out.println("This is Even number");
		}
		else {
			System.out.println("This is odd number");
		}

	}
	
	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();
		e.getEvenOdd(100);
		e.getEvenOdd(23);
		e.getEvenOdd(1);

		
	}

}
