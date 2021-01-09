package Day7.file_handling;

import java.io.*;

public class Example1 {
	
	public static void main(String[] args) {
		
		try {
			//File file =new File("Cources.txt");
			File file =new File("D:\\Cources.txt");
			Boolean b=file.createNewFile();
			if(b)
			{
				System.out.println("File created sucessfully : "+file.getName());
			}
			else
			{
				System.out.println("The file already exist");
			}
			
		}catch(Exception e) {
			
			System.out.println("Exception occour: "+e);
		}
	}

}
