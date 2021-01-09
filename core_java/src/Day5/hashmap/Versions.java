package Day5.hashmap;

import java.util.*;

public class Versions {
	
	public static void main(String[] args) {
		
		Map<Double, String> mobile = new HashMap<Double, String>();
		
		mobile.put(7.1, "Samsung");
		mobile.put(8.2, "Oppo");
		mobile.put(6.8, "Samsung");
		mobile.put(9.2, "MI");
		
		System.out.println(mobile);
		
		mobile.put(6.8, "MI");
		
		System.out.println(mobile);
	}

}
