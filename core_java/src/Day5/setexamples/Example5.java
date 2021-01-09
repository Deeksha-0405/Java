package Day5.setexamples;

import java.util.*;

import Day3.Classattributes.Employee;

public class Example5 {
	
	public static void main(String[] args) {
		
		
		
			Employee emp1 = new Employee("Jeeya",101);
			Employee emp2 = new Employee("rina",102);
			Employee emp3 = new Employee("heena",103);
			Employee emp4 = new Employee("diya",104);
			
			Set<Employee> strr = new HashSet<Employee>();
			strr.add(emp1);
			strr.add(emp2);
			strr.add(emp3);
			strr.add(emp4);
		
			for(Employee emp:strr)
			{
				System.out.println(emp);
			}
		
	
	}

}
