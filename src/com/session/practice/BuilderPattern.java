package com.session.practice;

public class BuilderPattern {
	
	public BuilderPattern login(String un , String pwd)
	{
		System.out.println("login with username " + un + "  password : " +pwd );
		return this;
	}
	public BuilderPattern search(String productName) {
		System.out.println("search the product :" +productName);
		return this;
	}

	public BuilderPattern addtoCart(String productname)
	{
		System.out.println("Adding product to cart : "+ productname);
		return this;
	}
	public BuilderPattern payment(String cardnum , String cc) {
		System.out.println("make payment using cardnum :" +cardnum +  cc );
		return this;
	}
	public BuilderPattern generateOrder(String productname) {
		System.out.println("generating order using  id 31223423  "+ productname);
		return this;
	}
}
