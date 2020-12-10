package com.java.String_Manipulations;

public class StringSplit {
//Write a program that breaks a whole string into small strings, 
	//and prints out its all values . (Hint: split, loop) .

	public static void main(String[] args) {

		String testing  ="sanity;smoke;regression;functional;non-functional;API ";
		String test[]=testing.split(";");
		for(String ele : test) {
			System.out.println(ele);	
		}
		
	}

}
