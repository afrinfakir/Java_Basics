package com.session.practice;

public class methodoverload {

	public static void main(String[] args) {

		methodoverload m = new methodoverload();
		m.login();
		m.login("abc");
	}

	public void login() {
		System.out.println("login with no argument");
		login("Aafrin");
	}

	public void login(String username) {
		System.out.println("fakir");
	}

	public void login(String username, String password) {

	}

}
