package com.session.practice;

public class BuilderPateernTest {

	public static void main(String[] args) {


		BuilderPattern b = new BuilderPattern();
		b
		.login("afrin@gmail.com", "afring@123")
		.search("appleMacBook")
		.addtoCart("appleMacBook")
		.payment("1232 3564 3566", "4555453")
		.generateOrder("appleMacBook");
		
		System.out.println("------------------------");
		b
		.login("afrin@gmail.com", "afring@123")
		.search("philipsGrinder")
		.payment("1232 3564 3566", "15656465")
		.generateOrder("philipsGrinder");
	}

}
