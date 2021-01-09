package Day4.ArrayList;

import java.util.ArrayList;

public class Example2 {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ajj");
		names.add("vgg");
		names.add("ikjh");
		names.add("rfvg");
		
		for(int i=0;i<names.size();i++)
		{
			String Name= names.get(i);			
			System.out.println(Name);
		}
		
	}

}
