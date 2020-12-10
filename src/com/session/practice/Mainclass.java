package com.session.practice;

public class Mainclass {

	public static void main(String[] args) {

//parent class reference and parent class object is static polymorphism access only parent class methods
		Vechicle v=new Vechicle();
		
		v.refuel();
	
		//parent class reference and child class object is called dynamic polymorphism access only parent class methods
		Vechicle v1=new Car();
		v1.start();//it will give ovverriden method from car class
		//v1.threadsafety();---we cannot call independent method of car class (ref type check)
		//child object and child reference is static poly we can access child as well as parent class methods	
		Car v3=new Car();
		
		v3.threadsafety();
		v3.start();
	
		
	//CHILD REFERENCE AND PARENT CLASS OBJECT IS DOWN CASTING WE HAVE TO CAST TO CHILD CLASS
		//@COMPILE TIME IT WILL SHOW CHILD CLASS METHOD 
		//@RUN TIME GIVE CLASSCASTEXCEPTIONS
//		Car v2=(Car) new Vechicle();
//		v2.refuel();
//		v2.fourwheeler();
	}

}
