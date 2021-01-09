package AssignmentSaturday.Assignment;

import java.util.*;

import AssignmentSaturday.beanfile.Nayan;

public class TestNayan {
	
	public static void main(String[] args) {
		
		Nayan game1= new Nayan("XX",2,10);
		Nayan game2= new Nayan("KX",1,5);
		Nayan game3= new Nayan("ZXZ",5,30);
		
		Map<Integer, Nayan> mapofGames = new HashMap<Integer, Nayan>();
		
		mapofGames.put(101, game1);
		mapofGames.put(102, game2);
		mapofGames.put(103, game3);
		
		Set<Integer> key = mapofGames.keySet();
		
		for(Integer n: key)
		{
			Nayan x = mapofGames.get(n);
			System.out.println(x);
		}
		
	}

}
