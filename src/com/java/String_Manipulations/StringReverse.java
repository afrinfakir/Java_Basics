package com.java.String_Manipulations;

public class StringReverse {
	// .Write a function/ method to reverse your own name.

	public static void main(String[] args) {

		ReverseFun("Aafrin");
	}

	public static void ReverseFun(String str) {

		System.out.println(str);
		int len = str.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

}
