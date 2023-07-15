package revisionPattrrn;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a=15;
				
				
		int b=0;
		
		for(int i=2;i<a;i++) 
		{
			if(a%i==0) 
			{
				b++;
				break;
			}
			
		}

		if (b==1) 
		{
			System.out.println("it is not prime");
		}
			
		else {System.out.println("Prirme number");}
	}

}
