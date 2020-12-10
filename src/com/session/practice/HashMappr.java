package com.session.practice;

import java.util.HashMap;
import java.util.Map;

public class HashMappr {

	public static void main(String[] args) {


		Map<String , String> hashmap = new HashMap<String,String>();
		hashmap.put("name", "Aafrin");
		hashmap.put("compony", "IBM");
		hashmap.put("country", "India");
		hashmap.put("designation", "swTestEngr");
		
		System.out.println(hashmap.get("name"));
		
		//using lambda
		hashmap.forEach((k,v)->System.out.println("key :" + k+ " value :" + v));
		System.out.println("------------");
		
		//using entryset
		for(Map.Entry<String, String> entry : hashmap.entrySet()) {
			System.out.println("key :" + entry.getKey() + "  value :"+ entry.getValue());
		}
		System.out.println("------------");

		//fetching keys
		for(String s : hashmap.keySet())
		{
			System.out.println("key :" + s);
		}
		System.out.println("------------");

		//fetching values
		for(String v : hashmap.values()) {
			System.out.println("values :" +v);
		}
	}

}
