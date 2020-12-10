package com.java.method;

public class Person {
//A person is eligible to vote if his/her age is greater than or 
	//equal to 18. 
//Define a method to find out if he/she is eligible to vote.
	
	public void getVote(int age)
	{
		System.out.println("The age of person : " +age);
		if(age < 18) {
			System.out.println("Not eligible for vote");
		}
		else if(age >= 18) {
			System.out.println("Eligible for vote");
		}
		 
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		p.getVote(12);
		p.getVote(0);
		p.getVote(32);

	}

}
