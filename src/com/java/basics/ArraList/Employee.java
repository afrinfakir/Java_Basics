package com.java.basics.ArraList;

public class Employee {

	public String[] getAsset(String empname) {

		String asset[] = new String[5];

		if (empname.equals("Binti")) {
			asset[0] = "mac";
			asset[1] = "mouse";
			asset[2] = "keyboard";
			asset[3] = "iphone";
			asset[4] = "laptop";
		} else if (empname.equals("Naveen")) {
			asset[0] = "mac";
			asset[1] = "mouse";
			asset[2] = "keyboard";
			// asset[3] ="iphone";
			// asset[4] ="laptop";
		}
		return asset;
	}

	public static void main(String[] args) {

		Employee e = new Employee();
		String[] s = e.getAsset("Naveen");
		System.out.println(s.length);
		for (String t : s) {
			System.out.println(t);
		}

	}

}
