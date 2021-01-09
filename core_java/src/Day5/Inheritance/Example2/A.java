package Day5.Inheritance.Example2;

public class A implements Calculator, Math{

	@Override
	public void mul() {
			int x=5;
			int y=10;
			int z=x*y;
			System.out.println(z);
		}


	@Override
	public void add() {
		int x=5;
		int y=10;
		int z=x+y;
		System.out.println(z);
		
	}

	@Override
	public void sub() {
		int x=5;
		int y=10;
		int z=x-y;
		System.out.println(z);
		
	}
	
	
	

}
