package Day4.ArrayList;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		
	ArrayList<String> cars=new ArrayList<String>();
	//	ArrayList cars=new ArrayList();
		
		cars.add("Volvo");
		cars.add("Mini");
		cars.add("Honda");
	//	cars.add(2);
		System.out.println(cars);
		System.out.println(cars.get(0));
		
		//Update the volovo
		
		cars.set(0,"Opel");
		System.out.println(cars);
		
		// size of an array
		System.out.println(cars.size());
		
		cars.remove(1);
		System.out.println(cars);
		
		cars.clear();
		
		System.out.println(cars);
		
	}
	
}
