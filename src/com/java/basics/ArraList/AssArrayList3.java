package com.java.basics.ArraList;

import java.util.ArrayList;

public class AssArrayList3 {

	public static void main(String[] args) {
		
	//Write a Java program to retrieve an element (at a specified index)
	//from a given array list.


		ArrayList<String> color=new ArrayList<String>();
		
		color.add("Yellow");
		color.add("Red");
		color.add("White");
		color.add("Black");
		color.add("Pink");
		System.out.println("Total size :" + color.size());
		color.stream().forEach(col->System.out.println(col));
		
		String FourthEle = color.get(4);
		System.out.println("The element at fourth index :" + FourthEle);
		String FirstEle = color.get(1);
		System.out.println("The element at first index :" + FirstEle);
		
	}

}
