package Logical1;

public class reverseString {

	public static void main(String[] args)
	{
		String a= "i love";
		String b="";
		
		for(int i=a.length()-1; i>=0; i--) 
		{
			b=b+a.charAt(i);
		}
		System.out.println("Reverse string "+b);

		
	}

}
