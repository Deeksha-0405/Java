package Day2.Arrays;

public class Example1 {
	// Array of String values
	public static void main(String[] args) {
		String[] cars= {"Volvo", "BMW", "Ford", "Mazda"};
		/*
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[4]);
		System.out.println(cars.length);
		*/
		for(int i=0;i<cars.length;i++)
		{
			String car=cars[i];
			System.out.println(car);
		}
		
	}

}
