package Day5.setexamples;

import java.util.*;

public class Example1 {
	
	public static void main(String[] args) {
		
		Set<Integer> setofid = new HashSet<Integer>();
		
		setofid.add(1002);
		setofid.add(1003);
		setofid.add(1004);
		setofid.add(1005);
		
	//	System.out.println(setofid);
		
		for(int x:setofid)
		{
			System.out.println(x);
		}
		
	}

}
