package Day2.Practice;

public class Example4 {
	public static void main(String[] args) {
		
		String[] Department={"Computer", "Info.Technology", "E&TC", "Mechanical"};
		
		int[] division={1,2,2,2,1,4};
		
		for(int i=0;i<Department.length;i++) {
		
			System.out.println("The Department available are " +Department[i]+ " with division " +division[i]);
		}
		
	}

}
