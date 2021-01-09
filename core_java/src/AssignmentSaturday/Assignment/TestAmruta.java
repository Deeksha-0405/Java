package AssignmentSaturday.Assignment;

import java.util.*;

import AssignmentSaturday.beanfile.Amruta;

public class TestAmruta {
	
	public static void main(String[] args) {
		
		Amruta arr1 = new Amruta("Veena","Married");
		Amruta arr2 = new Amruta("Zeel","Unarried");
		Amruta arr3 = new Amruta("Shiv","Married");
		Amruta arr4 = new Amruta("Jay","Unmarried");
		
		ArrayList<Amruta> status = new ArrayList<Amruta>();
		
		status.add(arr1);
		status.add(arr2);
		status.add(arr3);
		status.add(arr4);
		
		for(int i=0;i<status.size();i++)
		{
			System.out.println(status.get(i));
		}
	}
	


}
