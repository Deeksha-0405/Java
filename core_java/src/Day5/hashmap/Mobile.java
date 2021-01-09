package Day5.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Mobile {
	
	public static void main(String[] args) {
Map<String, String> mapOfSatesCities = new HashMap<String, String>();
		
		mapOfSatesCities.put("00101","Samsung");
		mapOfSatesCities.put("C521", "Oppo");
		mapOfSatesCities.put("D852","Samsung");
		mapOfSatesCities.put("AA741","Samsung");
		mapOfSatesCities.put("U41", "Oppo");
		
		System.out.println(mapOfSatesCities);
	
	}

}
