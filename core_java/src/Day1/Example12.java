package Day1;

public class Example12 {

	public static void main(String[] args) {
		System.out.println("Enter the following choice");
		System.out.println("1. Lenght of Text\n2. Turn to Upper case\n3. Turn to Lower case\n4. Find keyword");
		System.out.println("****************************************");
		String txt="Lost in Paradice";
		System.out.println(txt);
		int choice=(int)(Math.random()*4);
		switch (choice)
		{
		case 1:
		{
			System.out.println("your choice "+choice+" Lenght of Text : " +txt.length());
			break;
		}
		case 2:
		{
			System.out.println("your choice "+choice+" Turn to Upper case : " +txt.toUpperCase());
			break;
		}
		case 3:
		{
			System.out.println("your choice "+choice+" Turn to Lower case : " +txt.toLowerCase());
			break;
		}
		case 4:
		{
			System.out.println("your choice "+choice+" Find keyword :" +txt.indexOf("a"));
			break;
		}
		default:
		{
			System.out.println("Invalid Input");
		}
		}
	}
}
