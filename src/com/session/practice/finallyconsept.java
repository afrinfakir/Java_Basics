package com.session.practice;

public class finallyconsept {

	public static void main(String[] args) {

//exception handled or not finally is always be executed.
		//finally is block write with try catch block
		try {
			int i=4/0;
			System.out.println(i);
		}
		catch(NullPointerException n) {
			n.printStackTrace();
		}
		finally {
			System.out.println("finally is always executed");
		}
	}

}
