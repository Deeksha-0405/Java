package Day3.Polymorphisum;

public class CanteenA extends Canteen {
	
	public  void food() {
		System.out.println("North Indian");
	}
	
	protected void Bill(int x, int y)
	{
		int z=x+y;
		System.out.println("Your bill is : "+z);
	}

}
