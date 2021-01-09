package Day4.ArrayList;

import java.util.*;

public class Example8 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		

		arr.add(50);
		arr.add(20);
		arr.add(30);
		arr.add(80);
		
		Collections.sort(arr); // sorthing in  assending order
		Collections.sort(arr, Collections.reverseOrder()); // sorting in decending order

		for(int x:arr)
		{
			System.out.println(x);
		}
		
		
		
		
	}
}
