package Day2.Arrays;

public class Example3 {
	// Array of String values
	// for each loop
	public static void main(String[] args) {
		String[] cars= {"Volvo", "BMW", "Ford", "Mazda"};
		
		/*
		for(int i=0;i<cars.length;i++)
		{
			String car=cars[i];
			System.out.println(car);
		}
		*/
		
		// replacement for for loop is for each loop
		for(String car: cars)
		{
			System.out.println(car);
		}
		
	}

}
