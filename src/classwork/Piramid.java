package classwork;

public class Piramid {

	public static void main(String[] args) 
	{
		int i,j,k,row=7;
		
//code is correct
//		for(i=1;i<=row;i++) 
//		{
//			for(j=1;j<=row-i;j++) 
//			{
//				System.out.print(" ");
//			}
//			for(j=1; j<=i; j++) 
//			{
//				System.out.print(j+" " );
//			}
//			System.out.println();
//
//		}

		

		for(i=1;i<=row;i++) 
		{
			for(j=1;j<=row-i;j++) 
			{
				System.out.print(" ");
			}
			
			for(k=1;k<i;k++) 
			{
				System.out.print(k);
			}
			for(j=i; j>=1; j--) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
		

}
