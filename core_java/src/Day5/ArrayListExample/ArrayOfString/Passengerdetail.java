package Day5.ArrayListExample.ArrayOfString;

import java.util.ArrayList;
import java.util.Iterator;

import Day5.ArrayBean.Passenger;

public class Passengerdetail {
	public static void main(String[] args) {

		Passenger pass1 = new Passenger("A", 101);
		Passenger pass2 = new Passenger("B", 101);
		Passenger pass3 = new Passenger("C", 101);
		Passenger pass4 = new Passenger("D", 101);

		ArrayList<Passenger> pass0 = new ArrayList<Passenger>();
		pass0.add(pass1);
		pass0.add(pass2);
		pass0.add(pass3);
		pass0.add(pass4);
		
		Iterator<Passenger> itt = pass0.iterator();
		while(itt.hasNext())
		{
			Passenger x = itt.next();
			System.out.println(x);
		}

	}
}
