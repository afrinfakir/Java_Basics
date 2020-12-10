package com.java.String_Manipulations;

public class StringMiddle {
// Assume that a string consists of 3 words, print out the middle one. 
	public static void main(String[] args) {
		String str = "java selenium testing";
		String s[] = str.split(" ");
		System.out.println(s[1]);
		
	}
}
