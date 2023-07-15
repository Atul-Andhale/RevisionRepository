package revisionPATT;

public class fact {

	public static void main(String[] args) {
		int a=4;
		int fact=1;
		
		for(int i=a;i>0;i--) 
		{
			fact=i*fact;
		}
		System.out.println(fact);

	}

}
