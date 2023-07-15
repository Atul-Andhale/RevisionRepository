package revisionPattrrn;

public class LeftDecendingTrianle {

	public static void main(String[] args) {
		//row 5
		int star=4;
		int space=0;
		
		for(int a=1;a<=4;a++) 
		{
			for (int b=1;b<=space; b++) 
			{
				System.out.print(" ");
			}
			for (int c=1;c<=star;c++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star--;
			space++;
		}
		

	}

}
