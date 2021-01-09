package Day2.Deekshaexample;

public class Example5 {
	public static void main(String[] args) {
		
		/**
		*
		* Write a Java program to check if a given element exists in the array or not,
		* int[] salaries = {20000, 25000, 55000, 47000, 38000};
		* int salaryToFind = 55000;
		*
		*/
		
		int[] salaries = { 20000, 25000, 55000, 47000, 38000 };
		int salaryToFind = 55000;
		int flag=0, i;
		
		for( i=0;i<salaries.length;i++)
		{
			if(salaries[i]==salaryToFind)
			{
				System.out.print("Salary found ");
				flag=1;
				break;
			}	
			
		}
		if(flag==1)
		{
			System.out.println(i+1);
		}
		else
		{
			System.out.println("Salary not found");
		}
		
	}

}
