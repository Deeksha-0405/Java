package Day7.exceptions.user_define_exception;

public class Test {
	
	public static void checkage(int age) throws AgenotValidException
	{
		if(age<18)
		{
			
			throw new AgenotValidException("The age should be greter than 18 ");
			
		}
		else
		{
			System.out.println("No error Access granted");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			checkage(5);
		}catch(Exception e) {

			System.out.println("Somehting went wrong... : " +e);
		}
	}
	
	
	

}
