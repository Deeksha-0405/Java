package Day5.setexamples.Practice;

import java.util.*;

public class Example1 {
	
	public static void main(String[] args) {
		
		//Example on set
		
		//Lottery
		
		Scanner sc =new Scanner(System.in);
		Set<Integer> lottery = new HashSet<Integer>();
		lottery.add(1203);
		lottery.add(4520);
		lottery.add(7412);
		lottery.add(45632);
		
		System.out.println(lottery);
		
		//System.out.println("Enter your lucky number from 1 to 5");
		
		for(int i:lottery)
		{
			System.out.println(i);
		}
	}
	
	
	

}
