package com.java.String_Manipulations;

public class StringFrstLastChar {
	// Write a program that will print out the last character
	// and first character of a word.

	public static void main(String[] args) {
		FrstLastChar("Naveen Automation Labs");
		System.out.println("-----------------");
		FrstLastChar("selenium");
	}

	public static void FrstLastChar(String str) {

		System.out.println(str);

		for (int i = 0; i < str.length(); i++) {
			if (i == 0) {
				System.out.print(str.charAt(i));
			}
			if (i == str.length() - 1) {
				System.out.println(str.charAt(i));
			}
			if (str.charAt(i) == ' ') {
				System.out.print(str.charAt(i - 1) + " " + str.charAt(i + 1));
			}
		}
	}

}
