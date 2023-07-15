package CnrtlStat;

public class Switch {

	public static void main(String[] args) {
		String city="Pune";
		
		switch (city) {
		case "Pune":System.out.println("Welcome to Pune");
		break;
		case "Mumbai":System.out.println("Welcome to Mumbai");
		break;
		case "Nagpur":System.out.println("Welcome to Nagpur");
		break;



		default:System.out.println("Plz enter valid city");
			break;
		}
	}

}
