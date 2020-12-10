package com.java.basics.ArraList;

import java.util.ArrayList;


public class AssArrayList4 {

	public static void main(String[] args) {

//4. Write a Java program to update specific array
//element by given element.

		ArrayList<String> color = new ArrayList<String>();
		
		color.add("White");
		color.add("Blue");
		color.add("Yellow");
		color.add("Red");
		color.add("orange");
		
		System.out.println("Total size of ArrayList :" + color.size());
		
		for(int i=0;i<color.size();i++)
		{
			System.out.println(color.get(i));
		}
		System.out.println("----------------------------");
		
		color.set(2, "Green");
		
		for(String col:color)
		{
			System.out.println(col);
		}
		System.out.println("----------------------------");
		
		color.set(4,"Purple");
		color.stream().forEach(colors-> System.out.println(colors));
	}

}
