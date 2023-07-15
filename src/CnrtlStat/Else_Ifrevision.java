package CnrtlStat;

public class Else_Ifrevision {

	public static void main(String[] args) 
	{
		float per=65.3f;
		
		if(per>=75) 
		{
			System.out.println("you are in distinction class");
		}
		
		else if (per<=75 & per>=60) 
		{
			System.out.println("you are in 1st class ");
		}
		else if (per<=60 & per>=55) 
		{
			System.out.println("you are in 2ND class ");
		}
		else if (per<=55 & per>=50) 
		{
			System.out.println("you are in 3rd class ");
		}
		else
		{
			System.out.println("you are just pass");
		}


	}

}
