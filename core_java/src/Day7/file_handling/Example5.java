package Day7.file_handling;

import java.io.*;

public class Example5 {
	
	public static void main(String[] args) {
		try {
		File folder=new File("D://Folder_text");
		boolean b=folder.exists();
		if(b)
		{
			System.out.println("File already exist"+folder.getName());
		}
		else {
			System.out.println("File not exist");
		}
		
		folder.mkdir();
		System.out.println("created a folder");
		

		}
		catch(Exception e) {
			System.out.println("Exception Occured:"+e);
			}

		
	}

}
