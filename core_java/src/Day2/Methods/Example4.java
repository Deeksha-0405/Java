package Day2.Methods;

public class Example4 {
	// make methods as non static
public int add(int x, int y) {

		int z=x+y;
		return z;	
	}

public int sub(int x, int y) {

		int z=x-y;
		return z;		
	}


	public static void main(String[] args) {
		
		Example4 example4 = new Example4();
		
		int result1 = example4.add(3,9);
		int result2 = example4.sub(9,3);
		
		System.out.println("Addition : " +result1);
		System.out.println("Subtraction : " +result2);
	}
		
	}
