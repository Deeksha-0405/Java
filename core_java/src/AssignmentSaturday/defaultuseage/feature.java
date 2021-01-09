package AssignmentSaturday.defaultuseage;

public  class feature implements Mobile {
	
	@Override
	public void move() {
		System.out.println("moving...");
		
	}

	@Override
	public void blink() {
		System.out.println("Blinking....");
	}

	public void call()
	{
	//	Mobile.super.call();
		System.out.println("Calling.....from feature");
	}

	
	
}
