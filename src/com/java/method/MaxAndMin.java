package com.java.method;

public class MaxAndMin {
	// Define two methods to print the maximum and the minimum number respectively
	// among three numbers entered by user.
	public int max(int a, int b, int c) {
		System.out.println("Enter first number : " + a);
		System.out.println("Enter second number : " + b);
		System.out.println("Enter third number : " + c);
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	public int min(int a, int b, int c) {
		System.out.println("Enter first number :  " + a);
		System.out.println("Enter second number :  " + b);
		System.out.println("Enter third number :  " + c);
		if (a < b && a < c) {
			return a;
		} else if (b < c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		MaxAndMin m = new MaxAndMin();
		int maxnum = m.max(25, 28, 21);
		System.out.println("The maximum number is " + maxnum);
		System.out.println("--------------------------------");
		int minnum = m.min(25, 28, 21);
		System.out.println("The minimum number is " + minnum);

	}

}
