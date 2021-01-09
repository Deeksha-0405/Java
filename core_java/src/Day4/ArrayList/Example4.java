package Day4.ArrayList;

import java.util.*;

public class Example4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ajj");
		names.add("vgg");
		names.add("ikjh");
		names.add("rfvg");
		
		
		Iterator<String> iter = names.iterator();
		while(iter.hasNext())
		{
			String i = iter.next();
			System.out.println(i);
		}
	}

}
