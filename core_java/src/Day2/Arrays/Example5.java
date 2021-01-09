package Day2.Arrays;

public class Example5 {
	public static void main(String[] args) {
		
		// 2D array
		
		int[][] mynum = {{7,5,6,8},{1,2,3,4}};
		
		int[] firstarray = mynum[0];
		int[] secondarray = mynum[1];
		
		for(int i=0; i<firstarray.length;i++)
		{
			System.out.println(firstarray[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<secondarray.length;i++)
		{
			System.out.println(secondarray[i]);
		}
		
	}

}
