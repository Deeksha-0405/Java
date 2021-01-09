package Day2.Practice;

public class Example3 {
	public static void main(String[] args) {
		
		int[] age={21,25,26,20,24,23};
		
		for(int i=0; i<age.length; i++)
		{
			int a = age[i];
			System.out.println(a);
			if(age[i]>22)
			{
				System.out.println("Lisence available");
			}
		}
		
		
	}

}
