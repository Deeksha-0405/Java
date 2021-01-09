package Day7.Practice;

import java.util.*;

public class Example1 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("1. Add \n2. Sub \n3. Mul \n4.Div");
		System.out.println("Enter your choice :");
		int choice = sc.nextInt();
		System.out.println("Enter first number :");
		int a=sc.nextInt();
		System.out.println("Enter secound number :");
		int b=sc.nextInt();
		int c = 0;
		switch(choice)
		{
		case 1 :
			c=a+b;
			break;
		case 2:
			c=a-b;
			break;
		case 3:
			c=a*b;
			break;
		case 4:
			try {
				c=a%b;
			}catch(Exception e) {
				System.out.println("The number cant be Zero");
			}
			break;
		}
		System.out.println("Your answer is :"+c);
		
	}
}
