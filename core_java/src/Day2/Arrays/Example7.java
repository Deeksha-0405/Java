package Day2.Arrays;

public class Example7 {
	public static void main(String[] args) {
		
		// 2D array
		/*
		int[][] mynum = {{7,5,6,8},{1,2,3,4}};
		
		int[] firstarray = mynum[0];
		int[] secondarray = mynum[1];
		
		for(int i=0; i<firstarray.length;i++)
		{
			for( i=0; i<secondarray.length;i++)
			{
				System.out.println(firstarray[i]);
				System.out.println(secondarray[i]);
			}
			
		}
		*/
		
			int[][] myNumbers = {{40, 32, 55}, {23, 35, 61}};
			for(int i=0; i<myNumbers.length; i++) {
			 int[] innerArray = myNumbers[i];
			 for(int j=0; j<innerArray.length; j++) {
			  System.out.println(innerArray[j]);
			}
			}
		
	}

}
