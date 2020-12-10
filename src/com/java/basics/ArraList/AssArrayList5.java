package com.java.basics.ArraList;

import java.util.ArrayList;

public class AssArrayList5 {

	public static void main(String[] args) {


	//	5. Write a Java program to remove
		//the third element from a array list. 
		
		ArrayList<String> color = new ArrayList<String>();
		
		color.add("White");
		color.add("Blue");
		color.add("Pink");
		color.add("Red");
		color.add("Black");
		
		System.out.println("Total size of ArrayList :" + color.size());
		
		for(int i=0;i<color.size();i++)
		{
			System.out.println(color.get(i));
		}
		System.out.println("----------------------------");
		
		color.remove(2);
		
		for(String col:color)
		{
			System.out.println(col);
		}
		

	}

}
