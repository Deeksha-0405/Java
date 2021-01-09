package Day3.Classattributes;
import Day3.Beans.*;
public class Teststudent2 {

	public static void main(String[] args) {
		
		Student stud= new Student(1,"David","B.E");
		Student stud1= new Student(2,"Lisa","M.E");
		Student stud2= new Student(3,"Fami","B.E");
		Student stud3= new Student(4,"ami","M.E");
		
		Student[] arrayOfStudent = {stud,stud1,stud2,stud3};
		Teststudent2 teststudent2 = new Teststudent2();
		teststudent2.displayAllStudent(arrayOfStudent);
		
	}
	public void displayAllStudent(Student[] arrayOfStudent)
	{
		for(Student stud:arrayOfStudent)
		{
			System.out.println(stud);
		}
	}
	
}
