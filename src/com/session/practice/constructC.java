package com.session.practice;

import java.util.ArrayList;

public class constructC {

	String name;
	double price;
	String color;
	String model;
	ArrayList<String> compony;

	public constructC(String name, double price, String color, String model, ArrayList<String> compony) {
		this.name = name;
		this.price = price;
		this.color = color;
		this.model = model;
		this.compony = compony;
	}

	public static void main(String[] args) {
		ArrayList<String> comp = new ArrayList<String>();
		comp.add("Hawkins");
		comp.add("Urja");

		constructC c = new constructC("cooker", 2795, "red", "CTR50", comp);
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.color);
		System.out.println(c.model);
		System.out.println(c.compony);

		System.out.println(c.compony.get(0));

	}

}
