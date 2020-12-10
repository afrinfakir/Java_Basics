package com.java.String_Manipulations;

public class StringNumericPart {
	// get only numeric part from this String:
	// String s = "your transaction id is: 12345 and reference id is 34567";

	public static void main(String[] args) {

		String str = "your transaction id is: 12345 and reference id is 34567";
		String s = str.replaceAll("[^\\d ]", "");
		String st = s.trim();

		System.out.println(st);
	}
}