package Day4.Abstraction.Practice3;

public abstract class Message {
	
	//Abstraction
	
	public abstract void text();
	public abstract void video();
	public abstract void download();
	public void info()
	{
		System.out.println("I am a message");
	}

}
