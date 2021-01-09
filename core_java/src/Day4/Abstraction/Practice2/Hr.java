package Day4.Abstraction.Practice2;

import java.util.Scanner;

public abstract class Hr extends Manager{

	@Override
	public void HrActivity() {
		System.out.println("HR manager will handel this");
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of Activity conducted : ");
		int activity= sc.nextInt();

		System.out.println("The activity conduted by Hr Team is : " +activity);
	}

	

}
