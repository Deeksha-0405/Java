package Day1.Switches;

public class Example2 {
	public static void main(String[] args) {
		
		char Grade='A';
		switch(Grade) {
		
		case 'A':
			System.out.println("First class");
			break;
			
		case 'B':
			System.out.println("Secound class");
			break;
		
		case 'C':
			System.out.println("Just pass");
			break;
		
		case 'D':
			System.out.println("F");
			break;
			
		default:
			System.out.println("Not valid grade");
		}
	}

}
