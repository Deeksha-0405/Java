package Day4.ArrayList;

import java.util.*;

public class Example9 {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Ajj");
		names.add("vgg");
		names.add("ikjh");
		names.add("rfvg");
		
		//Collections.sort(names,Collections.reverseOrder());
		
	//	Collections.sort(names);
	//  Collections.reverse(names);
		
		Collections.sort(names, Collections.reverseOrder());
				
		for(String N:names)
		{
			System.out.println(N);
		}
	}

}
