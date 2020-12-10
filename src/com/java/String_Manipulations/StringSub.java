package com.java.String_Manipulations;

public class StringSub {
	// Write a program that gives you the
	//last half of the string.

	public static void main(String[] args) {

		String s = "This is java code";

		System.out.println("Given string : " +s);

		int len = s.length();

		System.out.println("Length of string : " + len);

		System.out.println("Last half of String : " + s.substring(len / 2));
	}

}
