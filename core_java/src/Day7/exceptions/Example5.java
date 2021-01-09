package Day7.exceptions;

public class Example5 {
	
	public static void main(String[] args) {
		
		try {
			checkage(15);
		}catch(Exception e) {
			System.out.println(e);
			String x =e.getMessage();
			System.out.println("Somehting went wrong... : " +x);
		}
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
