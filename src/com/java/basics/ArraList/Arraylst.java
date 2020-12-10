package com.java.basics.ArraList;

import java.util.ArrayList;

public class Arraylst {

	public ArrayList<String> getOrders(String empname) {
		System.out.println("get orders for "+ empname);
		ArrayList<String> orders = new ArrayList<String>();
		if(empname.equals("Afrin")) {
			orders.add("iphone");
			orders.add("laptop");
			orders.add("camera");
			orders.add("keyboard");
			orders.add("mouse");
		}
		else if(empname.equals("Tom")) {
			orders.add("iphone");
			orders.add("laptop");
			orders.add("camera");
			orders.add("keyboard");
			orders.add("mouse");
			orders.add("bag");
			orders.add("pendrive");
		}
		return orders;
	}
	public static void main(String[] args) {

		Arraylst a = new Arraylst();
		ArrayList<String> r =a.getOrders("Tom");
		System.out.println("total orders"+ r.size());
		for(String t : r) {
			System.out.println(t);
			
			
		}
		
	}

}
