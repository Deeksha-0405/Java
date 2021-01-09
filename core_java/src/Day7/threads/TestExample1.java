package Day7.threads;

public class TestExample1 {
	
	public static void main(String[] args) {
		
		Example1 example1= new Example1();
		//No need to create thread object we can wall start() by example1 object itself
		example1.start();
		
		
	}

}
