package Day7.exceptions;

public class Example2 {
	
	public static void main(String[] args) {
		checkage(15);
		
	}
	
	
	public static void checkage(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("The age should be greter than 18 ");
		}
		else
		{
			System.out.println("No error Access granted");
		}
	}

}
