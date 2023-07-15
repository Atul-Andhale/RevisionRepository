package constructorRevision;

public class ConstructorStudy {
	
	int a=20;
	int b=30;
	int c=40;
	
	public ConstructorStudy(int x, int y )  
	{
		a=x;
		b=y;
	}



	
	public static void main(String[] args) {
		ConstructorStudy n=new ConstructorStudy(10, 10);
		n.Mul();

	}
	
	public void Mul()
	{
		int mul=a*b*c;
		System.out.println(mul);
	}

}
