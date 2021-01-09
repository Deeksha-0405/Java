package Day3.Classattributes;

import Day3.Beans.*;
public class TestPatent {
	
public static void main(String[] args) {
		
		Patent p1= new Patent(1,"ML","1H00");
		Patent p2= new Patent(2,"AI","2H01");
		Patent p3= new Patent(3,"DB","3D55");
		Patent p4= new Patent(4,"Oracle","H006");
		
		Patent[] arrayOfPatent = {p1,p2,p3,p4};
		TestPatent testPatent = new TestPatent();
		testPatent.display(arrayOfPatent);
	
		
	}

public void display(Patent[] arrayOfPatent)
{
	for(Patent pat:arrayOfPatent)
	{
		System.out.println(pat);
	}
}

}

