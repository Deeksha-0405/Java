package Day5.hashmap;

import java.util.HashMap;
import java.util.*;
import java.util.Set;

public class Mobile2 {
	
	public static void main(String[] args) {
Map<String, String> cities = new HashMap<String, String>();
		
cities.put("00101","Samsung");
cities.put("C521", "Oppo");
cities.put("D852","Samsung");
cities.put("AA741","Samsung");
cities.put("U41", "Oppo");
		
	//	System.out.println(cities);
		
		Set<String> keyset = cities.keySet();
		
		for(String x:keyset)
		{
			String city = cities.get(x);
			System.out.println(x + " " +city);

		}
	
	}

}
