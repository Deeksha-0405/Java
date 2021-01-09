package Day4.ArrayList.ArraylistofBeans;

import java.util.ArrayList;
import java.util.Iterator;

import Day3.Classattributes.Employee;

public class Example1 {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Divya", 3001);
		Employee employee2 = new Employee("jiya", 3002);
		Employee employee3 = new Employee("Hema", 3003);
		Employee employee4 = new Employee("Sita", 3004);
		
		ArrayList<Employee> employeelist = new ArrayList<Employee>();
		employeelist.add(employee1);
		employeelist.add(employee2);
		employeelist.add(employee3);
		employeelist.add(employee4);
		
		Iterator<Employee> itt = employeelist.iterator();
		while(itt.hasNext())
		{
			Employee x = itt.next();
			System.out.println(x);
		}
		
	/*	
		for(Employee emp:employeelist)
		{
			System.out.println(emp);
		}
		*/
	}

}
