package com.java.String_Manipulations;

public class StringEquality {
	// Write a program to check two different strings equality.

	public static void main(String[] args) {

		String s1 = "Welcome to testing world";
		String s2 = "Welcome to testing world...";
		//using equals
		if (s1.equals(s2)) {
			System.out.println("Strings are equal");
		} 
		else {
			System.out.println("Strings are not equal");
		}
		
	}

}
