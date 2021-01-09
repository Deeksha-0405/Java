package Day7.exceptions;

public class Example3 {
	
	public static void main(String[] args) throws Exception {
		checkage(19);
		
	}
	
	
	public static void checkage(int age) throws Exception
	{
		if(age<18)
		{
			throw new Exception("The age should be greter than 18 ");
		}
		else
		{
			System.out.println("No error Access granted");
		}
	}

}
