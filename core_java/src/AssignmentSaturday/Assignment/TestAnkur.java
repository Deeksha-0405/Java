package AssignmentSaturday.Assignment;

import java.util.*;

import AssignmentSaturday.beanfile.Ankur;

public class TestAnkur {
	
	public static void main(String[] args) {
		
		Ankur ann1 = new Ankur(101,"Rita","11:30");
		Ankur ann2 = new Ankur(102,"Jian","12:30");
		Ankur ann3 = new Ankur(103,"Zen","01:30");
		Ankur ann4 = new Ankur(104,"Payal","09:30");
		
		ArrayList<Ankur> arr = new ArrayList<Ankur>();
		
		arr.add(ann1);
		arr.add(ann2);
		arr.add(ann3);
		arr.add(ann4);
		
		for(Ankur x:arr)
		{
			System.out.println(x);
		}
	}

}
