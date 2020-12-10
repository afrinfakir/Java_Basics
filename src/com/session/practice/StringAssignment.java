package com.session.practice;

public class StringAssignment {

	public static void main(String[] args) {

		// String str = "This is my first java code and i am so happy";
		String str = "this is my first java code and i like selenium";
		System.out.println(str);

		System.out.println("1st occurance of i at index : " + str.indexOf("i"));// 1st

		System.out.println("2nd occurance of i at index : " + str.indexOf("i", str.indexOf("i") + 1));// 2nd---1

		System.out.println("3rd occurance of i at index : "
				+ str.indexOf("i", (str.indexOf("i") + 1 + (str.indexOf("i") + 1 + (str.indexOf("i") + 1)))));// 3rd----3
		System.out.println("-----3rd---: "+str.indexOf("i", (str.indexOf("i") + 1 + (str.indexOf("i") + 1))));//3rd-----2
		System.out.println("----3rd---: "+str.indexOf("i", (str.indexOf("i") + 1
				+ (str.indexOf("i") + 1 + (str.indexOf("i") + 1 + (str.indexOf("i") + 1))))));//3rd-----4

		System.out.println("4th occurance of i at index : " + str.indexOf("i", (str.indexOf("i") + 1
				+ (str.indexOf("i") + 1 + (str.indexOf("i") + 1 + (str.indexOf("i") + 1 + (str.indexOf("i") + 1)))))));// 4th---5
		
		System.out.println("----4th occurance of i at index : " + str.indexOf("i", (str.indexOf("i") + 1
				+ (str.indexOf("i") + 1 + (str.indexOf("i") + 1 + (str.indexOf("i") + 1 + (str.indexOf("i") + 1+(str.indexOf("i")+1))))))));//4th----6
		System.out.println("5th occurance of i at index : " + str.indexOf("i",
				(str.indexOf("i") + 1 + (str.indexOf("i") + 1 + (str.indexOf("i") + 1 + (str.indexOf("i") + 1
						+ (str.indexOf("i") + 1 + (str.indexOf("i") + 1 + (str.indexOf("i") + 1 + (str.indexOf("i") + 1
								+ (str.indexOf("i") + 1 + (str.indexOf("i") + 1 + str.indexOf("i") + 1))))))))))));// 5th---11

		System.out.println("---------------------------------------");

		// for given string output should be ---->12345
		String s = "Your transaction ID is 12345 please enroll";

		System.out.println(s.substring(s.indexOf("is") + 3, s.length() - 14));

	}

}
