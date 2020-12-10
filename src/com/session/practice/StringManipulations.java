package com.session.practice;

public class StringManipulations {

	public static void main(String[] args) {

		String str = "Your transaction ID is 12345 please enroll";
		System.out.println(str.length());// 42
		System.out.println("char at 5th index==>" + str.charAt(5));// t
		System.out.println(str.indexOf('s'));// 9
		System.out.println(str.indexOf("ID"));// 17
		System.out.println(str.indexOf('a', str.indexOf('a') + 1));// 10

		System.out.println("-------------");
		String s1 = "This is my first java code and I am so happy";
		System.out.println(s1.indexOf("i", s1.indexOf("i") + 1));// 2nd occurance
		System.out.println("-------------");
		System.out.println(s1.indexOf("i", ((s1.indexOf("i") + 2))));// 3rd
		// s1.indexOf(str, fromIndex);

		System.out.println(str.indexOf("have"));// -1 [not available then -1]

		System.out.println(str.subSequence(0, 6));
		System.out.println(str.substring(0, 6));
		// assignment
		String s = "Your transaction ID is 12345 please enroll";
		System.out.println(s.substring(s.indexOf("is") + 3, s.length() - 14));

		String str1 = "geehynbfjjeks";
		char ch = 'e';
		int N = 3;
		System.out.print(findNthOccur(str1, ch, N));
	}

	static int findNthOccur(String str1, char ch, int N) {
		int occur = 0;

		// Loop to find the Nth
		// occurence of the character
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == ch) {
				occur = occur + 1;
			}
			if (occur == N)
				return i;
		}
		return -1;
	}

}
