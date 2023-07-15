package InterfaceeRevision;

public class Prince implements King,Queen {

	public static void main(String[] args)
	{
		Prince k=new Prince();
		k.Kingdom();
		k.gold();
		k.sword();
		k.Horse();
	
	}

	@Override
	public void Kingdom() {
		System.out.println("kingdom");
		
	}

	@Override
	public void sword() {
		System.out.println("Sword");
		
	}

	@Override
	public void Horse() {
		
		King.super.Horse();
		Queen.super.Horse();
	}
	
	

	

	
}
