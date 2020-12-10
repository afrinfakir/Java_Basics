package com.java.constructor;

import java.util.ArrayList;

public class University {
	// Design a University class template with the following features:
	// variables:name,country,stablishedDate, List of course provided in ArrayList<String>
	// --Design the constructor of this class with different parameters and all parameters
	// -Write the get method of each variable with return keyword.

	private String name;
	private String contry;
	private String stablishedDate;
	private ArrayList<String> courseList;

	public University(String name, String contry, String stablishedDate) {
		this.name = name;
		this.contry = contry;
		this.stablishedDate = stablishedDate;
	}

	public University(String name, String contry, String stablishedDate, ArrayList<String> courseList) {
		this.name = name;
		this.contry = contry;
		this.stablishedDate = stablishedDate;
		this.courseList = courseList;
	}

	public String getName() {
		return name;
	}

	public String getContry() {
		return contry;
	}

	public String getStablishedDate() {
		return stablishedDate;
	}

	public ArrayList<String> getCourseList() {
		return courseList;
	}

}
