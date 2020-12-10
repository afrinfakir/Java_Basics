package com.java.basics.ArraList;

import java.util.ArrayList;

public class Ass_ArrayList_1 {

	public static void main(String[] args) {


		// Write a Java program to create a new array list, add some colors (string) and
		//print out the collection
		
		ArrayList<String> color=new ArrayList<String>();
		
		color.add("Yellow");
		color.add("Red");
		color.add("White");
		color.add("Black");
		color.add("Pink");
		color.add("Blue");
		color.add("Gray");
		color.add("Green");
		color.add("Purple");
		color.add("Orange");
		
		int TotalSize = color.size();
		
		System.out.println("Total size of Arraylist: " + TotalSize);
		//using for loop
		for(int i=0;i<TotalSize;i++)
		{
			System.out.println(color.get(i));
		}
	System.out.println("-------------------------");
		//using for each 
		for(String colorName:color)
		{
			System.out.println(colorName);
		}
	System.out.println("-------------------------");
		//using stream
		color.stream().forEach(colors->System.out.println(colors));
	}

}
