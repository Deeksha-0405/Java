package Day8.jdbc.Deeksha;

import java.sql.*;

import Day8.jdbc.Bean.beanstudent;
import Day8.jdbc.Deeksha.Dee.StudentDao;
import utility.DBUtil;

public class Example6 {
	
	public static void main(String[] args) {
		
		//beanstudent stud=new beanstudent(106, "Geeta", "M.E", 4, 25);
		beanstudent beanstud=new beanstudent(105, "Danial", "M.E", 4, 22);
	beanstudent stud=new beanstudent();
		Example6 ex=new Example6();
		//ex.adddata(stud);
		//ex.getAllStudent();
		//ex.getStudent(102);
		//ex.getStudentname("disha");
	//	ex.getStudname("jeet");
		StudentDao student=new StudentDao();
	//	student.getStudent(102);
	//	student.deleteStudent(104);
		student.Updatestudent(beanstud);
		
	}
	

}
