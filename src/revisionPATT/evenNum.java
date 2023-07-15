package revisionPATT;

public class evenNum {

	public static void main(String[] args) {
		int a=9;
		int count=0;
		
		for(int i=2;i<a;i++) 
		{
			if(a%i==0) 
			{
				count++;
				break;
			}
			
			
		}
		if(count==1) 
		{
			System.out.println("not prime");
		}
		else {System.out.println("prime");}

	}

} 