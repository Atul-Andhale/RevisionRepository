package classwork;

public class TwoWayPyramid {

	public static void main(String[] args) {
		int i,j,row=6,k,l;
		for(i=1;i<=row;i++) 
			{
				for(j=1;j<=row-i;j++) 
				{
					System.out.print(" ");
				}
				for(j=1; j<=i; j++) 
				{
					System.out.print(j+" " );
				}
				
			System.out.println();
			}
		for(i=row;i>=1;i--) 
		{
			for(j=1;j<=row-i;j++) 
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
}}
