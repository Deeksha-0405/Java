package Day7.exceptions;

public class Example4 {
	
	public static void main(String[] args) {
		checkage(15);
		
	}
	
	
	public static void checkage(int age)
	{
		if(age<18)
		{
			try {
				throw new Exception("The age should be greter than 18 ");
			} catch (Exception e) {
				System.out.println("Catch block executed");
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("No error Access granted");
		}
	}

}
