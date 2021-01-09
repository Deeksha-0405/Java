package Day5.ArrayListExample.ArrayOfInteger;

import java.util.ArrayList;
import java.util.*;

public class Example1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> array1 = new ArrayList<Integer>();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number of Passengers : ");
		int n=sc.nextInt();
		int x;
		System.out.println("Enter the passenger code : ");
		for(int i=0;i<n;i++)
		{
			x=sc.nextInt();
			array1.add(x);
		}
		
		System.out.println("The codes are : ");
		for(int i=0;i<n;i++)
		{
			System.out.println(array1.get(i));
		}
	}
	
	
}
