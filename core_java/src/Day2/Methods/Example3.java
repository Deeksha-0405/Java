package Day2.Methods;

public class Example3 {
	
public static int add(int x, int y) {

		int z=x+y;
		return z;	
	}

public static int sub(int x, int y) {

		int z=x-y;
		return z;		
	}
	public static void main(String[] args) {
		int result1 = add(3,9);
		int result2 = sub(9,3);
		
		System.out.println("Addition " +result1);
		System.out.println("Subtraction " +result2);
	}
		
	}
