package Day5.ArrayListExample.ArrayOfString;

import java.util.ArrayList;
import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		
ArrayList<String> names = new ArrayList<String>();
		
					
		System.out.println("Enter the passenger Name : ");
		
		names.add("Ajj");
		names.add("vgg");
		names.add("ikjh");
		names.add("rfvg");
		
		for(String N:names)
		{
			System.out.println(N);
		}
		
	}
}
