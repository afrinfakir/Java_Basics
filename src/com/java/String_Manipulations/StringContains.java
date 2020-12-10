package com.java.String_Manipulations;

public class StringContains {
	//Write a program to verify a word or a character contained in the sentence.

	public static void main(String[] args) {

		isWordPresent("selenium java", "java");
	}
	public static void isWordPresent(String str,String word) {
		
		System.out.println("Given String : " + str);
		System.out.println("find the word : " + word);
		
		if(str.contains(word)) {
			
			System.out.println( word + " is present in the string");
		}
		else {
			System.out.println(  word + " is not present in the string");
		}
	}
}
