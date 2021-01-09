package AssignmentSaturday.Assignment;

import java.util.*;

import AssignmentSaturday.beanfile.Keshav;

public class TestKeshav {
	
	public static void main(String[] args) {
		
		Keshav jersey1 = new Keshav(5663,"Sachin");
		Keshav jersey2 = new Keshav(8552,"Dhoni");
		Keshav jersey3 = new Keshav(4553,"Hardik");
		Keshav jersey4 = new Keshav(6552,"Dyan");
		
		Set<Keshav> setofjersey = new HashSet<Keshav>();
		
		setofjersey.add(jersey1);
		setofjersey.add(jersey2);
		setofjersey.add(jersey3);
		setofjersey.add(jersey4);
		
		Iterator<Keshav> irr = setofjersey.iterator();
		while(irr.hasNext())
		{
			Keshav x = irr.next();
			System.out.println(x);
		}
		
		
	}

}
