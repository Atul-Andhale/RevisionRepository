package revisionPattrrn;

public class RightTriangle {

	public static void main(String[] args) {
		//row 5
		int star=1;
		int space=4;
		
		for(int a=1; a<=5;a++) 
		{
			for(int b=1;b<=space;b++) 
			{
				System.out.print(" ");
			}
			for(int c=1;c<=star;c++) 
			{
				System.out.print("*");
			}
			System.out.println();
			star++;
			space--;
		}

	}

}
