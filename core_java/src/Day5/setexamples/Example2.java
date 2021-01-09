package Day5.setexamples;

import java.util.*;

public class Example2 {
	
	public static void main(String[] args) {
		
		Set<Integer> setofid = new HashSet<Integer>();
		
		setofid.add(1002);
		setofid.add(1003);
		setofid.add(1004);
		setofid.add(1005);
		
	 Iterator<Integer> itt = setofid.iterator();
	 while(itt.hasNext())
	 {
		 int i = itt.next();
		 System.out.println(i);
	 }
	}

}
