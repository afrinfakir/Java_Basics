package com.session.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Arraylistsessions {

	public static void main(String[] args) {

		ArrayList<Integer> ar=new ArrayList();
		
		
		
		
	//	System.out.println(ar.size());
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());
		
		
//		for(int i=0;i<ar.size();i++)
//		{
//			System.out.println(ar.get(i));
//			
//		}
System.out.println(	" ----------------------------------------------------"	);
//		for(Object h:ar)
//		{
//			System.out.println(ar);
//		}
		
		System.out.println("------------------------------------------------------");
		
		ar.stream().forEach(ele-> System.out.println(ele));
		
		
		
		
	//	List<Objects> ob=new ArrayList<Objects>();
		
		//ob.add("Aafrin");
		//ob.add(1222);
		
		
	}

}
