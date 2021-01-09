package Day1.strings;

public class Example8 {
	public static void main(String[] args) {
		
		int EmpID = 20;
		String FirstName = "Deeksha";
		String LastName = "Poojari";
		
		System.out.println("Employee ID : " + EmpID + " "+ "Employee name : " + FirstName + " " + LastName);
		System.out.println(FirstName.toUpperCase() + " " + LastName.toUpperCase());
		System.out.println("The employee currently work in \"ZENSAR\" Technology ");
		String txt = "String - stores text, such as \"Hello\". String values are surrounded by double quotes\r\n" + 
				"int - stores integers (whole numbers), without decimals, such as 123 or -123\r\n" + 
				"float - stores floating point numbers, with decimals, such as 19.99 or -19.99\r\n" + 
				"char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes\r\n" + 
				"boolean - stores values with two states: true or false";
		System.out.println(txt);
		System.out.println(txt.indexOf("floating"));
	}

}
