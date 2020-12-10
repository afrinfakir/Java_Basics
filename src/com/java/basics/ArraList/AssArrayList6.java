package com.java.basics.ArraList;

import java.util.ArrayList;

public class AssArrayList6 {

	public static void main(String[] args) {


// Write a Java program to search an element in a array list.

		ArrayList<String> color = new ArrayList<String>();
		
		color.add("White");
		color.add("Blue");
		color.add("Yellow");
		color.add("Red");
		color.add("orange");
		
		System.out.println("Total size of ArrayList :" + color.size());
		
		for(String col:color)
		{
			System.out.println(col);
		}
		
		//to search value Yellow
		if(color.contains("Yellow")) {
			System.out.println("The element is found");
		}
		else {
			System.out.println("The element is not found");
		}
			
		
		
		
		
	}

}
