package revisionPattrrn;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("plz enter string");
//		String s=sc.next();
//		String s1="";
//		
//		for(int a=s.length()-1;a>=0;a--) 
//		{
//			s1=s1+s.charAt(a);
//		}
//		System.out.println("reverse string "+s1);
//		System.out.println("original "+s);
		
		
		String s="mom";
		String s1="";
		
		for(int a=s.length()-1;a>=0;a--) 
		{
			s1=s1+s.charAt(a);
		}
		System.out.println(s1);
		
		if(s1.equals(s))
		{
			System.out.println("String is polindrome");
		}
		else
		{
			System.out.println("it is not polindrome");
		}
	}

}
