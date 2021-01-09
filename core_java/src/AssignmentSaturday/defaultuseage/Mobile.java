package AssignmentSaturday.defaultuseage;

public interface Mobile {
	
	public void move();
	public void blink();
	
	default void call()
	{
		System.out.println("Calling.....from mobile");
	}
	
	

}
