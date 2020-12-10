package com.session.practice;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int i = 1 / 0;
			System.out.println(i);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
