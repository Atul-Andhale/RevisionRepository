package patternPractice;

public class PyramidDecendingEg2 {

	public static void main(String[] args) 
	{
		int star=7;
		int space=0;
		
		for(int i=1;i<=7;i++) 
		{
			for(int j=1;j<=space;j++) 
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
			
		}

	}

}
