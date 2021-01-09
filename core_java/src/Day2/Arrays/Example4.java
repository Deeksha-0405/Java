package Day2.Arrays;

public class Example4 {
	public static void main(String[] args) {
		
		String[] cars= {"Volvo", "BMW", "Ford", "Mazda"};
		
		for(String x:cars)
		{
			System.out.println(x);
		}
		
		System.out.println("Updated value");
		System.out.println();
		cars[0]="Maruti";
		cars[3]="Oddi";
		
		for(String x:cars)
		{
			System.out.println(x);
		}
	}

}
