package AssignmentSaturday.Assignment;

import java.util.*;

import AssignmentSaturday.beanfile.Nazneen;

public class TestNazneen {
	
public static void main(String[] args) {
	
	Nazneen perfume1 = new Nazneen("Engage","EngageCollection",56.25,250);
	Nazneen perfume2 = new Nazneen("Boy","King",25.36,300);
	Nazneen perfume3 = new Nazneen("Yardle","Yardle",25.25,200);
	Nazneen perfume4 = new Nazneen("Layer Shot","EngageCollection",56.25,150);
	Nazneen perfume5 = new Nazneen("Water Girl","PerfumeCollection",56.25,100);
	
	Map<Integer, Nazneen> arr = new HashMap<Integer, Nazneen>();
	
	arr.put(1, perfume1);
	arr.put(2,perfume2);
	arr.put(3,perfume3);
	arr.put(4,perfume4);
	arr.put(5,perfume5);
	
	Set<Integer> key = arr.keySet();
	Iterator<Integer> itt = key.iterator();
	while(itt.hasNext())
	{
		Integer x= itt.next();
		Nazneen n = arr.get(x);
		System.out.println(x+" : "+n);
	}
}	

}
