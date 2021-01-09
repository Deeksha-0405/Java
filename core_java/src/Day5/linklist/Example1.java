package Day5.linklist;

import java.util.*;

public class Example1 {
	
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<String>();
		
		link.add("abc");
		link.add("def");
		link.add("ghi");

		link.get(0);
		System.out.println("updating volvo to opel");
		link.set(0, "Opel");
		System.out.println(link);
		System.out.println("removing index 2:");
		link.remove(2);
		System.out.println(link);
		System.out.println("Now removing all elements from cars LinkedList");
		link.clear();
		System.out.println(link);
		
	}

}
