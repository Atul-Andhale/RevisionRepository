package Logical1;

public class revNumberString {

	public static void main(String[] args) {
		
		int a=123;
		String intStr=Integer.toString(a);
		String rev="";
		for(int i=intStr.length()-1; i>=0;i--)
		{
			rev=rev+intStr.charAt(i);
		}
		
		int revnum=Integer.parseInt(rev);
		System.out.println(revnum);
	}

}
