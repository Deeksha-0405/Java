package Day2.Methods;

public class Example6 {


 // method with array as parameter
public void displayNamesArray(String[] names) {

	for(String x:names) {
		System.out.println(x);
		
    }
 }

public String[] getArrayofname()
{
	String[] names = {"John", "David", "Patrick", "Derek"};
	return names;
}
}
