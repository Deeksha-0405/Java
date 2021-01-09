package AssignmentSaturday.defaultuseage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example2 {
	
	public static void main(String[] args) {
		
List<String> cars = new ArrayList<String>();
		
		cars.add("Kia");
		cars.add("Maruti");
		cars.add("Hyndai");
		
		Set<String> carsoflist = new HashSet<String>(cars);
		
		for(String x:carsoflist)
		{
			System.out.println(x);
		}
	
		
	}
	
	

}
