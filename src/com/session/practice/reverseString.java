package com.session.practice;

public class reverseString {

	public static void main(String[] args) {

		
		String s="afrin";
		
	int len=s.length();		
	String rev="";
	
	for(int i=len-1;i>=0;i--) {
		
		 rev=rev+s.charAt(i);
	}
		System.out.println(rev);
	}

	/*StringBuffer sf= new StringBuffer(s);
	 System.out.println(sf.reverse());
*/
	
	}


