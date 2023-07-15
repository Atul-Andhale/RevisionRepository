package constructorRevision;

public class StudentInfo
{
	String Stu_Name;
	int Stu_NO;
	char Stu_Div;
	char Grade;
	
	public StudentInfo(String Nav, int no, char div) 
	{
		Stu_Name=Nav;
		Stu_NO=no;
		Stu_Div=div;
	}
	
	public void Info() 
	{
		System.out.println(Stu_Name);
		System.out.println(Stu_NO);
		System.out.println(Stu_Div);
		System.out.println(Grade);
	}
	
	

}
