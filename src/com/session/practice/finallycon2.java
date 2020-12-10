package com.session.practice;

public class finallycon2 {

	public static void main(String[] args) {

		int marks=getMarks("Ali");
		System.out.println(marks);
		
	}

	public static int getMarks(String name) {

		try {
			if (name.equals("Neha")) {
				return 100;
			} else if (name.equals("Sheetal")) {
				return 90;
			} else if (name.equals("Ali")) {
				int i = 9/0;
				return 95;
			} else {
				return -1;
			}

		} catch (Exception e) {
			return -2;
		}
		
		finally {
			System.out.println("Bye...");
			//return -3;
		}

	//@SuppressWarnings("finally")
//	public static int getMrks(String name) {
//		
//		try {
//		if (name.equals("Aafrin")) {
//			return 98;
//			//System.out.println(marks);
//		}
//		else if(name.equals("naveen")){
//			return  99;
//			//System.out.println(marks);
//
//		}
//		else {
//			return -1;
//		}
//		
//		}
//	
//		catch(Exception e)
//		{
//			System.out.println("exception is coming");
//			return -2;
//		}
		
//		finally {
//		System.out.println("Finally block executed");
//		return -3;
//	}
		}
	}

