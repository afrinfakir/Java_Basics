package com.java.method;

public class PrimeNumber {
	// Define a method to find out if number is prime or not.

	public boolean isPrimeNum(int num) {

		System.out.println("The given number is : " + num);

		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PrimeNumber p = new PrimeNumber();
		boolean b = p.isPrimeNum(23);
		// boolean b=p.isPrimeNum(25);
		if (b == true) {
			System.out.println("The number is prime ");
		} else {
			System.out.println("The number is not prime");
		}
	}
}
