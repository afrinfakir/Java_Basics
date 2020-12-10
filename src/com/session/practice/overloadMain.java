package com.session.practice;

public class overloadMain {

	public static void main(String[] args) {
		//overloadMain m =new overloadMain();
		
		main(0);
		main("wee");
		main("abc",3);
		System.out.println("oroginal");
		
		
	}

	public static void main(int a) {

		System.out.println("int parameter ");
	}

	public static void main(String args) {
		System.out.println("string parameter ");

	}

	public static void main(String name, int a) {

		System.out.println("string parameter and int para ");
	}

}
