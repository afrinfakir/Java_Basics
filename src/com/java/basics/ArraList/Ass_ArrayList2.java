package com.java.basics.ArraList;

import java.util.ArrayList;

public class Ass_ArrayList2 {

	public static void main(String[] args) {


		// Write a Java program to insert an element into the array list 
		//at the first and last positions.
		
		ArrayList<String> animal =new ArrayList<String>();
		System.out.println("Total size of Arraylist :" + animal.size());

		animal.add("Dog");
		animal.add("Cow");
		animal.add("Goat");
		animal.add("Cat");
		animal.add("Horse");
		
		System.out.println("Total size of Arraylist :" + animal.size());
		for(String animals:animal)
		{
			System.out.println(animals);
		}
		  System.out.println("-------------------------------");
		  
		 animal.trimToSize();
		  
//		animal.add(0,"Tiger");
//		animal.add(5,"Lion");
		for(int i=0;i<animal.size();i++)
		{
			System.out.println(animal.get(i));
		}
		
//		

	}

}
