package Day7.wrapper;

public class Example2 {
	
	public static void main(String[] args) {
		
		Integer i=5;
		Double d=5.78;
		Character c='A';
		String s="Deeksha";
		
		System.out.println("Integer " +i.intValue());
		System.out.println("Double " +d.doubleValue());
		System.out.println("Character " +c.charValue());
		System.out.println("String " +s+ " No s.Stringvaue for string");
		System.out.println("There is a toString method for string");
		
		String x= s.toString();
		System.out.println(x);
		System.out.println(x.length());
	}

}
