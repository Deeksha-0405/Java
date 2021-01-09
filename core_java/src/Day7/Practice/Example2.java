package Day7.Practice;

import java.io.*;
import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		
		File file=new File("Practice.txt");
		try {
			boolean b=file.createNewFile();
			if(b)
			{
				System.out.println("file created");
			}
			else {
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			System.out.println("No file created");
			e.printStackTrace();
		}
		
		Scanner sc;
		try {
			sc = new Scanner(file);
			while(sc.hasNext())
			{
				String s=sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception : "+e);
			e.printStackTrace();
		}
			
				
	}

}
