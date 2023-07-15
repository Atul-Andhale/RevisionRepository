package Logical1;

public class palindromeString {

	public static void main(String[] args)
	{
		String a= "MOM";
		String b="";
		
		for(int i=a.length()-1; i>=0; i--) 
		{
			b=b+a.charAt(i);
		}
		System.out.println("Reverse string "+b);
		
		if(a.equals(b))
		{
			System.out.println("it is palindrome");
		}
		else
		{System.out.println("it is normal string");};

	}

}
