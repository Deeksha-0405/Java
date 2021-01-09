package Day7.file_handling;

import java.io.File;

public class Example6 {
public static void main(String[] args) {
		
		File file=new File("D://Text");
		boolean b=file.exists();
		if(b)
		{
			System.out.println("File exist");
		}
		else {
			System.out.println("file not found");
		}
		System.out.println("Deletion of file" +file.getName());
		boolean bb=file.delete();
		if(bb)
		{
			System.out.println("Deleted sucessful");
		}
		else {
			System.out.println("No file found");
		}
		
	}

}
