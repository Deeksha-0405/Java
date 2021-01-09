package Day2.Deekshaexample;

public class TestExample9 {
	
	public static void main(String[] args) {
		
		int choice=1;
		Example9 example9= new Example9();
		System.out.println("Country Available are: ");
		String[] Nation = example9.country();
		System.out.println("Your choice is : " +Nation[choice-1]);
		
		switch (choice)
		{
		case 1:
			example9.India();	
			break;
		case 2:
			break;
		case 3:
		    break;
		case 4:
			break;
			
		}
		
	}

}
