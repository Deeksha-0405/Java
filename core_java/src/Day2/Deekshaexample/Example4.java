package Day2.Deekshaexample;

public class Example4 {
	
	/**
	*
	* Write a Java program to find sum of values of a given array.
	*
	*/

		 public static void main(String[] args) {
	int[] marks = {69, 85, 66, 80, 81 };
	int sum=0;
	for(int i=0;i<marks.length;i++) {
		sum +=marks[i];
		
	}
	System.out.println(sum);
	
	System.out.print("Average ");
	int avg= sum/marks.length;
	System.out.println(avg);
	}

}
