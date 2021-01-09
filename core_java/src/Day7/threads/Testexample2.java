package Day7.threads;

public class Testexample2 {
	public static void main(String[] args) {
		// implements runnable
		Example2 example2=new Example2();
		Thread thread =new Thread(example2);
		//System.out.println(example2);
		//System.out.println(thread);
		thread.start();
	}

}
