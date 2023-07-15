package Logical1;

public class ArmStrongNum {

	public static void main(String[] args) {
		int a=153;
		int b=0;
		
		for(int i=a; i>0; i=i/10) 
		{
			int r=i%10;
			b=b+(r*r*r);
		}
		
		System.out.println(b);
		
		if(a==b) 
		{
			System.out.println("ArmStrong");
		}
		else {System.out.println("Not Armstrong");}
	}

}
