package Day1.strings;

public class Example10 {
public static void main(String[] args) {
	
	
	char c1 = '1';
    int i = (int) c1;
    System.out.println(c1+"  "+i);
    
   int x= Character.getNumericValue(c1);
   System.out.println(c1+"  "+x);
   
	
	// double to char its not convertable so it will show some different value
/*	 
   double value = 22.2;
   int x = (int) value;
   System.out.println(value+"  "+x);
           char c2 = (char) value;
           System.out.println(value+"  "+c2);
      
*/

}
}
