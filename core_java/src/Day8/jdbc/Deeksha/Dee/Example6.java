package Day8.jdbc.Deeksha.Dee;

import java.sql.*;

import Day8.jdbc.Bean.beanstudent;
import utility.DBUtil;

public class Example6 {
	
	public static void main(String[] args) {
		
		//beanstudent stud=new beanstudent(106, "Geeta", "M.E", 4, 25);
	beanstudent stud=new beanstudent();
		Example6 ex=new Example6();
		//ex.adddata(stud);
		//ex.getAllStudent();
		//ex.getStudent(stud);
		ex.getStudentname(stud);
	}
	
	public void adddata(beanstudent student) {

		System.out.println("We are going to add Product : "+student);
		Connection con =DBUtil.getMySqlDBConnection();
		String sql="insert into student values(?,?,?,?,?)";
		try {
			PreparedStatement pst= con.prepareStatement(sql);
			pst.setInt(1, student.getStudentroll());
			pst.setString(2, student.getStudentname());
			pst.setString(3, student.getStudentcourse());
			pst.setInt(4, student.getCourseduration());
			pst.setInt(5, student.getStudentage());
			int result=pst.executeUpdate();
			if(result==0)
			{
				System.out.println("Update sucess");
			}
			else {
				System.out.println("Update Unsucess");
			}
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		
	}

	
	public void getAllStudent() {
		Connection con =DBUtil.getMySqlDBConnection();
		String sql="select * from student";
		try {
			
			PreparedStatement pst= con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				int roll=rs.getInt("roll_number");
				String name=rs.getString("student_name");
				String course=rs.getString("course");
				int duration=rs.getInt("duration");
				int age=rs.getInt("age");
				System.out.println("Roll No :"+roll+"\nName : "+name+"\nCourses :"+course+"\nDuration :"+duration+"\nage :"+age);
				System.out.println("++++++++++++++++++++++++++");
				
			}
			
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
	}
	
	public void getStudent(beanstudent stud) {
		int rollno=102;
		Connection con =DBUtil.getMySqlDBConnection();
		String sql = "select * from student where roll_number=?";
		
		try {
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, rollno);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				int roll=rs.getInt("roll_number");
				String name=rs.getString("student_name");
				String course=rs.getString("course");
				int duration=rs.getInt("duration");
				int age=rs.getInt("age");
				
				if(rollno==roll){
					System.out.println("Roll number found");
					System.out.println("Roll No :"+roll+"\nName : "+name+"\nCourses :"+course+"\nDuration :"+duration+"\nage :"+age);
				}
			}else
			{
				System.out.println("Roll number not found");
			}
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
	}
	
		public void getStudentname(beanstudent stud)
		{
			String S_name="Disha";
			Connection con=DBUtil.getMySqlDBConnection();
			String sql="select * from student where student_name=?";
			
			try {

				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1, "S_name");
				ResultSet rs=pst.executeQuery();
				if(rs.next())
				{
					int roll=rs.getInt("roll_number");
					String s_name=rs.getString("student_name");
					String course=rs.getString("course");
					int duration=rs.getInt("duration");
					int age=rs.getInt("age");
					
					if(S_name.equals(s_name)){
						System.out.println("Name found in Database");
						System.out.println("Roll No :"+roll+"\nName : "+stud+"\nCourses :"+course+"\nDuration :"+duration+"\nage :"+age);
					}
					
				}else
				{
					System.out.println("Name not found in database");
				}
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}

		}
	
}
