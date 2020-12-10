package com.java.String_Manipulations;

public class StringPresence {
	// Write a method which gives an index of (-1) if string is not available.
	// . it should return integer. if String is present, then it should return the
	// specific index.

	public static void main(String[] args) {

		isPresent("this is java code", "java");
		int p = isPresent("hello world", "selenium");
		System.out.println(p);
	}

	public static int isPresent(String str1, String str2) {

		System.out.println("Given String : " +str1);
		System.out.println("find string  : " +str2);
		
		if (str1.indexOf(str2) > 0) {
			System.out.println(str2 + " is present at index :" +str1.indexOf(str2));
		} 
		else if(str1.indexOf(str2) < 0) {
			System.out.println(str2 + " is not present in string");
			//System.out.println((str1.indexOf(str2)));
		
		return -1;
	}
		return -1;
	
		
}
}