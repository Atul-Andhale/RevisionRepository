package revisionPATT;

public class armStrongNum {

	public static void main(String[] args) {
		int a=153;
		int b=0;
		
		for(int i=a;i>0;i=i/10) 
		{
			int rev=i%10;
			b=b+(rev*rev*rev);
		}

		System.out.println(b);
		if(a==b) 
		{
			System.out.println("armStrong num");
		}
	}

}
