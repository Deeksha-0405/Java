package AssignmentSaturday.Assignment;

import java.util.*;

import AssignmentSaturday.beanfile.Naveena;

public class TestNaveena {
	
	public static void main(String[] args) {
		
		Naveena nav1 = new Naveena("Veer", "Pune" ,85296341);
		Naveena nav2 = new Naveena("Shlok", "Nagpur" ,85294121);
		Naveena nav3 = new Naveena("Raj", "Mumbai" ,78965412);
		Naveena nav4= new Naveena("Dev", "Satar" ,96321475);
		
		ArrayList<Naveena> ann = new ArrayList<Naveena>();
		
		ann.add(nav1);
		ann.add(nav2);
		ann.add(nav3);
		ann.add(nav4);
		
		Iterator<Naveena> itt = ann.iterator();
		while(itt.hasNext())
		{
			Naveena x = itt.next();
			System.out.println(x);
		}
		
	}
	

}
