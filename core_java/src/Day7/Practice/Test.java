package Day7.Practice;

import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) throws NoEmployeeException {
		
		System.out.println("Employee portal");
		System.out.println("Enter you Employee Id : ");
		Scanner sc=new Scanner(System.in);
		int empid=sc.nextInt();
		
		try {
		if(empid>9999)
		{
			throw new NoEmployeeException();
		}
		else {
			System.out.println("Acess granted");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
