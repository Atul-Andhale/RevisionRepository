package revisionPATT;

public class intrev {

	public static void main(String[] args) {
		int a=321;
		int b=0;
		
		for(int i=a;i>0;i=i/10) 
		{
			int rev=i%10;
			b=b*10+rev;
			
			
		}
		System.out.println(b);

	}

}
