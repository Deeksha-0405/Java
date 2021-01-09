package Day5.linklist.ArraylistofBeans;

import java.util.*;

import Day3.Classattributes.Employee;

public class Example1 {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Divya", 3001);
		Employee employee2 = new Employee("jiya", 3002);
		Employee employee3 = new Employee("Hema", 3003);
		Employee employee4 = new Employee("Sita", 3004);
		
		LinkedList<Employee> employeelist = new LinkedList<Employee>();
		employeelist.add(employee1);
		employeelist.add(employee2);
		employeelist.add(employee3);
		employeelist.add(employee4);
		System.out.println(employeelist);
		
		employeelist.set(0, new Employee("Gooooo", 3004));
		
		Iterator<Employee> itt = employeelist.iterator();
				
		for(Employee emp:employeelist)
		{
			System.out.println(emp);
		}
		
	}

}
