package AssignmentSaturday;

import java.util.*;

public class Example1 {
	
	public static void main(String[] args) {
		
		Set<String> cars = new HashSet<String>();
		
		cars.add("Kia");
		cars.add("Maruti");
		cars.add("Hyndai");
		
		List<String> carsoflist = new ArrayList<String>(cars);
		display(carsoflist);
		/*for(String x:carsoflist)
		{
			System.out.println(x);
		}
	*/
		
	}
	
	public static void display(List<String> list1)
	{
		for(String x:list1)
		{
			System.out.println(x);
		}
	}
	

}
