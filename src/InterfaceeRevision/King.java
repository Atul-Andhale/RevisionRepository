package InterfaceeRevision;

public interface King
{

	void Kingdom();
	
	void sword();
	
	default void gold() 
	{
		System.out.println("kings gold");
		
	}
	
	default void Horse() 
	{
		System.out.println("Kings horse");
	}
}
