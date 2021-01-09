package Day5.setexamples;

import java.util.*;

public class Example4 {
	
	public static void main(String[] args) {
		
		Set<String> strr = new HashSet<String>();
		
			
			strr.add("India");
			strr.add("USA");
			strr.add("UK");
			strr.add("Africa");
		
			
			Iterator<String> itrr = strr.iterator();
			while(itrr.hasNext())
			{
				String country = itrr.next();
				System.out.println(country);
			}
		
		
	
	}

}
