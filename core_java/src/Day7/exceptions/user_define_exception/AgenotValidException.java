package Day7.exceptions.user_define_exception;

public class AgenotValidException extends Exception {
	
	public AgenotValidException()
	{
		System.out.println("The age should be greater than 18");
	}
	
	public AgenotValidException(String message)
	{
		System.out.println(message);
	}

}
