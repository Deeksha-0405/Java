package Day7.file_handling;

import java.io.*;
import java.util.*;

public class Example3 {
	
	public static void main(String[] args) {
		
		File file=new File("Cources.txt");
		try {
			Scanner sc=new Scanner(file);
			while(sc.hasNext())
			{
				String x= sc.nextLine();
				System.out.println(x);
			}
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Exceppion occured : "+e);
		}
		
	}
	

}
