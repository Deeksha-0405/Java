package Day3.Naz;

import java.util.Scanner;

public class Naz1 {
	
	Scanner sc = new Scanner(System.in);
	
	public void display()
	{
		int ans;
	    System.out.println("****Welcome To Nazland****");
	    
	    
	    do {
	        System.out.println("\n1. Guess the Movie Quiz");
	        System.out.println("\n Enter your choice : ");
	        int ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1: 
	        System.out.println(" ******Guess the Movie******");
	        movie();
	        break;
	        
	    }
	    System.out.println("Do you want to continue 1/0 ?");
	    ans=sc.nextInt();
	    
	    
	    }while(ans==1);
	    
	    System.out.println("Hope you Enjoyed, Do visit again !!");

	}
	
	public void movie()
	{
		
	    System.out.println("Enter your guess : ");
	    String Mo= sc.nextLine();
	   sc.nextLine();
	    
	    if(Mo.equalsIgnoreCase("om"))
	    {
	        System.out.println("Congo Right Ans !!!");
	    }
	    else
	    {
	        System.out.println("Better luck next time");
	    }
	}

}
