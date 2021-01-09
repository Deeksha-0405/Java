package Day3.Classattributes;
import Day3.Beans.*;
public class Teststudent {

	public static void main(String[] args) {
		
		Student stud= new Student(1,"David","B.E");
		Student stud1= new Student(2,"Lisa","M.E");
		Student stud2= new Student(3,"Fami","B.E");
		System.out.println(stud);
		System.out.println(stud1);
		System.out.println(stud2);
		Student stud3= new Student(4,"ami","M.E");
		System.out.println(stud3);
		
	}
	
}
