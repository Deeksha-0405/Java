package Day7.exceptions;

public class Example1 {
	
	public static void main(String[] args) {
		
		try {
			int[] a= {5,7,4,2};
			
			System.out.println(a[1]);
		}
		catch(Exception e){
			
			System.out.println("Something went wrong...");
		}
		finally {
			System.out.println("This is finally... a end of try and catch block");
		}
	}

}
