package com.session.practice;

public class ecomm {

	public static void main(String[] args) {

	}

	public void login() {
		search();//can call non static inside  non static 
		cantactspage();
	}

	public void search() {
		Adtocart();
	}

	public void Adtocart() {
		homepage();//can call static inside non static 
	}

	public static void homepage() {
		cantactspage();
		// login();we can not call non static inside static

	}

	public static void cantactspage() {

	}

}
