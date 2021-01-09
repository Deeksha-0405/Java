package Day3.PracticeDee;

import java.util.Scanner;

public class Booking2 extends Booking {
	Scanner sc=new Scanner(System.in);
	public void choice()
	{
		
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		
		switch (choice)
		{
		case 2:
			System.out.print("Enter Kilometer to Travel :");
			int km= sc.nextInt();
			System.out.print("Enter number of passengers :");
			int passenger=sc.nextInt();
			System.out.print("Do you have a coupen yes/no : ");
			String coupen = sc.next();
			
			if(coupen.equalsIgnoreCase("YES"))
			{
				System.out.print("Enter The coupen : ");
				String coupencode = sc.next();
			}
			
			System.out.println("!!Your Booking has been confirmed!!");	
			System.out.println("Killometer : "+km + "\nNumber of Passenger : "+passenger+"\nCoupen type:" +coupen);
			System.out.println("Thank You");
					}
		
		
			}


}
