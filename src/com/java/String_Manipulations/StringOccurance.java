package com.java.String_Manipulations;

public class StringOccurance {
	// Write a program to get the 3rd “ e “ of the string .
	// For example: “Welcome to Naveen Automation Labs ! “.
	public static void main(String[] args) {
		String str1 = "Welcome to Naveen Automation Labs ! ";	
		System.out.println("3rd 'e' of the string at index : " + str1.indexOf("e",
				(str1.indexOf("e") + 1 + (str1.indexOf("e") + 1 + (str1.indexOf("e") + 1 + (str1.indexOf("e") + 1))))));		
		System.out.println("-----------------------------");
		String str = "Welcome to Naveen Automation Labs ! ";
		char ch = 'e';
		int num = 3;
		System.out.print("The " + ch + " is present at index : " + StrOccur(str, ch, num));
	}
	//for Nth occur
	public static int StrOccur(String str, char ch, int num) {

		int occur = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				occur = occur + 1;
			}
			if (occur == num)
				return i;
		}
		return -1;
	}

}
