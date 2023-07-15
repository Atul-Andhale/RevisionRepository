package classwork;

public class Reverse {

	public static void main(String[] args) 
	{
		int i,j,row=7;
		
		for(i=row;i>=1;i--) 
		{
//			for(j=1;j<=row-i;j++) 
//			{
//				System.out.print(" ");
//			}
			for(j=row-i;j>=1;j--) 
			{
				System.out.print(" ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(j +" " );
			}
			System.out.println();
		}
	
	}

}
