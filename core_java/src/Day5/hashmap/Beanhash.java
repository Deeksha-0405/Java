package Day5.hashmap;

import java.util.*;

import Day3.Classattributes.Employee;

public class Beanhash {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Veen", 101);
		Employee emp2 = new Employee("Fugi", 102);
		Employee emp3 = new Employee("olli", 103);
		Employee emp4 = new Employee("Cana", 104);
		
		Map<Integer, Employee> mapofemp = new HashMap<Integer, Employee>();
		
		mapofemp.put(1,emp1);
		mapofemp.put(2,emp2);
		mapofemp.put(3,emp3);
		mapofemp.put(4,emp4);
		
		Set<Integer> key = mapofemp.keySet();
		
		for(int x:key)
		{
			Employee city = mapofemp.get(x);
			System.out.println(city);
		}
		
		
		Iterator<Integer> itt = key.iterator();
		while(itt.hasNext())
		{
			int x = itt.next();
			Employee name = mapofemp.get(x);
			System.out.println(x +" : "+name);
		}
		
		
	}

}
