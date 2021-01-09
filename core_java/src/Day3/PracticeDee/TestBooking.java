package Day3.PracticeDee;

import java.util.Scanner;

public class TestBooking extends Booking {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("************Welcome to CabCab**********");
		TestBooking testbooking=new TestBooking();
		Booking test=new Booking2();
		
		testbooking.displaychoice();
		testbooking.choice();
		System.out.println("Want to Exit");
		String accept=sc.nextLine();

			if(accept.equalsIgnoreCase("No"))
			{
				test.choice();
			}
			else
			{
				System.out.println("Byeeee");
			}
		
		//System.out.println(testbooking);
		
	}
	
}
