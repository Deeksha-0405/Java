package Day7.Practice;

import java.io.*;
import java.util.*;

public class Example3 {
	public static void main(String[] args) {
		
		try {
			FileWriter file=new FileWriter("Practice.txt");
			Scanner sc1=new Scanner(System.in);
			Scanner sc2=new Scanner(System.in);
			System.out.print("enter number of time you have to eneter the text :");
			int n=sc1.nextInt();
			System.out.println("enter the text");
			for(int i=0;i<n;i++)
			{
				System.out.print((i+1)+" : ");
				file.write(sc2.nextLine()+"\n");
				System.out.println();
			}
			
			file.close();
		} catch (Exception e) {
			System.out.println("Soemthing went wrong : "+e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Completed");
		}
		
		
		
	}

}
