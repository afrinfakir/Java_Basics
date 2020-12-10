package com.session.practice;

	public class finalizeconsp {

	 int name = 5;

	public static void main(String[] args) {
		finalizeconsp fz = new finalizeconsp();
		fz = null;
		String str = new String();
		str= null;
		//System.gc();
		System.out.println("hi");
		
		
		
	}
	public void finalize() {
		System.out.println("finalize");
	}
}
