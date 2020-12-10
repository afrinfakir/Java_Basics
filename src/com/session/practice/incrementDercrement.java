package com.session.practice;

public class incrementDercrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v=2;
		System.out.println(v++);
		System.out.println(v);
		
		double c= 12.33;
		double d= 23.33;
		int a=100;
		int b=200;
		String x="hello";
		String y="world";
		
		System.out.println(c+d+(x+y)+a+b);
		System.out.println(c+d+x+y+(a+b));
		
		System.out.println(x+y+c+d+a+b);
		
		//System.err.println("err msg in red color");
		
		//float k=(float)(9/2.0);
		float k=9/2.0f;
		System.out.println(k);
		
		Object ob[] = new Object[4];
		ob[0]="Aafrin";
		ob[1]=12.33;
		ob[2]=23;
		ob[3]='c';
		 
		for(Object h:ob)
		{
			System.out.println(h);
		}
		}
		
		

	}


