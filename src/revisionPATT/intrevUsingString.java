package revisionPATT;

public class intrevUsingString {

	public static void main(String[] args) 
	{  
		int num=123;
		String strNum = Integer.toString(num);
		String b="";
		
		for(int i=strNum.length()-1;i>=0;i--) 
		{
			b=b+strNum.charAt(i);
		}
		int rev = Integer.parseInt(b);
		
		System.out.println(rev);

	}

}
