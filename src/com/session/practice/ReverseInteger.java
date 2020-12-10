package com.session.practice;

public class ReverseInteger {

	public static void main(String[] args) {

 
		//int num=12345;
		//int rev=0;
		
		
		/*while(num>0)
		{
			
			
			rev= rev * 10 + num % 10;
			num= num / 10;
			//System.out.println("rev number is:"+rev);
			
		}
		System.out.println("rev number is:"+rev);
	}
*/
	
	/*	
		while(num>0)
		{
			rev=rev * 10 + num % 10;
			num=num/10;
		}
		
		System.out.println(rev);*/
		
		/*String s="hello world";
		int length=s.length();
		String rev="";
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		*/
		
		
		String str="The rains Have started";
		String str1="the rains have started";
		System.out.println(str.length());
		
		System.out.println(str.charAt(6));
		
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('s',str.indexOf('s')+1));
		
		System.out.println(str.indexOf("hello"));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.substring(0,9));
		
		String s="  hello world";
		System.out.println(s.trim());
		System.out.println(s.replace(" ",""));
		System.out.println(str.concat(s));
		
		System.out.println(str+s);
		
		String a="hello";
		String b="world";
		int x=100;
		int y=200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(a+b+(x+y));
		
		
		
		
	}
}
