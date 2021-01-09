package Day7.file_handling;

import java.io.*;

//writing in the file
public class Example2 {
	
	public static void main(String[] args) {
		
		try {
			FileWriter filewriter =new FileWriter("Cources.txt");
			filewriter.write("Core java\n");
			filewriter.write("Advance java\n");
			filewriter.append("AWS\n");
		
			filewriter.close();
			
			System.out.println("Sucess");
		}catch(Exception e)
		{
			System.out.println("Exception occour: "+e);
		}
	}

}
