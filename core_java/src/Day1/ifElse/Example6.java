package Day1.ifElse;

public class Example6 {
	
	public static void main(String[] args) {
		
		
	    System.out.println("The lucky draw");
	    int value = (int)(Math.random()*101);
	    if(value<30)
	    {
	    	System.out.println("No Price");
	    }
	    else if(value<70)
	    {
	    	System.out.println("one chance extra");
	    }
	    else
	    {
	    	System.out.println("Winner!!!!!!!!!");
	    }
	    
	    System.out.println(value);
	    
	}

}
