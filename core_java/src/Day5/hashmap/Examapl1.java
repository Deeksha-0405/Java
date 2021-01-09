package Day5.hashmap;

import java.util.*;

public class Examapl1 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> mapOfcity = new HashMap<Integer, String>();
		

		mapOfcity.put(00100, "Pune");
		mapOfcity.put(25, "Delhi");
		mapOfcity.put(52, "Mumbai");
		mapOfcity.put(10, "Waki");
		
		//System.out.println(mapOfcity);
		Set<Integer> keyset = mapOfcity.keySet();
		Iterator<Integer> itt = keyset.iterator();
		while(itt.hasNext())
		{
			int x =itt.next();
			String city = mapOfcity.get(x);
			System.out.println(x+" : "+city);
			
			
		}
		
	}

}
