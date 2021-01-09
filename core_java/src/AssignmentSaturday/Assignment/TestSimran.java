package AssignmentSaturday.Assignment;

import java.util.*;

import AssignmentSaturday.beanfile.Simran;

public class TestSimran {
	
	public static void main(String[] args) {
		
		Simran patient1 = new Simran(101,"Neel","Cold");
		Simran patient2 = new Simran(102,"Nitin","T.B");
		Simran patient3 = new Simran(103,"Mukesh","Jaundice");
		Simran patient4 = new Simran(104,"Juli","Maleria");
		
		Set<Simran> arr = new HashSet<Simran>();
		
		arr.add(patient1);
		arr.add(patient2);
		arr.add(patient3);
		arr.add(patient4);
		
		for(Simran s:arr)
		{
			System.out.println(s);
		}
		
		
		
	}

}
