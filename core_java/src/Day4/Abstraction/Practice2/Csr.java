package Day4.Abstraction.Practice2;

import java.util.Scanner;

public class Csr extends Hr {

	@Override
	public void FunEvents() {

		System.out.println("Will be manger by CSR cell");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of Activity conducted : ");
		int activity= sc.nextInt();

		System.out.println("The activity conduted by CSR Team is : " +activity);
		
	}

}
