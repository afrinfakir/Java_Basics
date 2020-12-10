package com.java.constructor;

import java.util.ArrayList;

public class UniversityTest {
	public static void main(String[] args) {
		University u1 = new University("SPPU", "India", "20-1-1978");
		System.out.println(u1.getName() + "  " + u1.getContry() + "  " + u1.getStablishedDate());
		
		System.out.println("---------------------");
		
		ArrayList<String> courses = new ArrayList<String>();
		courses.add("BE");
		courses.add("BTech");
		courses.add("BSC");
		courses.add("BCS");
		
		University u2 = new University("SPPU", "India", "20-1-1978", courses);
		System.out.println(u2.getName() + "  " + u2.getContry() + "  " + u2.getStablishedDate() + " " + u2.getCourseList().get(1));

	}

}
