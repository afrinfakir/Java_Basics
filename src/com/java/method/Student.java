package com.java.method;

public class Student {
	/*Write a program which will ask the user to enter his/her marks (out of 100).
 Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail     */
	
	public  static void getMarks(int marks) {
		System.out.println("Please enter the marks :" + marks);
			if(marks > 90 && marks <= 100) {
				System.out.println("Grade---AA");
			}
			else if(marks > 80 && marks <= 90) {
				System.out.println("Grade---AB");
				}
			else if(marks > 70 && marks <= 80) {
				System.out.println("Grade---BB");
				}
			else if(marks > 60 && marks <= 70) {
				System.out.println("Grade---BC");
				}
			else if(marks > 50 && marks <= 60) {
				System.out.println("Grade---CD");
				}
			else if(marks > 40 && marks <= 50) {
				System.out.println("Grade---DD");
				}
			else if(marks <=40) {
				System.out.println("Fail");
				}
			else if(marks > 100){
				System.out.println("Invalid marks");
			}
	}
	public static void main(String[] args) {
			getMarks(16);
			Student.getMarks(78);
			Student.getMarks(101);
			Student.getMarks(50);

	}

}
