package com.java.String_Manipulations;

public class StringTrim {
	// Remove all spaces in a String .
	// For example : “ Hello Everyone “ .
	// Expected result: “HelloEveryone”.

	public static void main(String[] args) {
		
		String s = "         Hello      Everyone       ";
		
		// String s1 = s.trim();
		// String s2 = s1.replace(" ", "");
		
		System.out.println(s.trim().replace(" ", ""));
	}

}
