package Day8.jdbc.Deeksha.Dee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Day8.jdbc.Bean.beanstudent;
import utility.DBUtil;

public class StudentDao {

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
	
	public void getStudent(int stud_no) {

		Connection con =DBUtil.getMySqlDBConnection();
		String sql = "select * from student where roll_number=?";
		
		try {
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, stud_no);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				rs.getInt(1);
				int roll=rs.getInt("roll_number");
				String name=rs.getString("student_name");
				String course=rs.getString("course");
				int duration=rs.getInt("duration");
				int age=rs.getInt("age");
				
				if(stud_no==roll){
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
	
		public void getStudentname(String stud)
		{
			Connection con=DBUtil.getMySqlDBConnection();
			String sql="select * from student where student_name=?";
			
			try {

				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1, stud);
				ResultSet rs=pst.executeQuery();
				if(rs.next())
				{
					String name=rs.getString(2);
					
					
					if(name.equalsIgnoreCase(stud)){
						
						int roll=rs.getInt("roll_number");
						String s_name=rs.getString("student_name");
						String course=rs.getString("course");
						int duration=rs.getInt("duration");
						int age=rs.getInt("age");	
						
						System.out.println("Name found in Database");
						System.out.println("Roll No :"+roll+"\nName : "+s_name+"\nCourses :"+course+"\nDuration :"+duration+"\nage :"+age);
					}
					
				}else
				{
					System.out.println("Name not found in database");
				}
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}

		}
		
		public void getStudname(String stud)
		{
			Connection con=DBUtil.getMySqlDBConnection();
			String sql="select * from student where student_name like ?";
			
			try {

				PreparedStatement pst=con.prepareStatement(sql);
				pst.setString(1, "%"+stud+"%");
				ResultSet rs=pst.executeQuery();
				if(rs.next())
				{
					String name=rs.getString(2);
					
					
						int roll=rs.getInt("roll_number");
						String s_name=rs.getString("student_name");
						String course=rs.getString("course");
						int duration=rs.getInt("duration");
						int age=rs.getInt("age");	
						
						System.out.println("Name found in Database");
						System.out.println("Roll No :"+roll+"\nName : "+s_name+"\nCourses :"+course+"\nDuration :"+duration+"\nage :"+age);
					}
					
		
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}

		}
		
		public void deleteStudent(int rollnumber)
		{
			Connection con = DBUtil.getMySqlDBConnection();
			String sql="delete from student where roll_number=?";
			try {
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1, rollnumber);
				int result=pst.executeUpdate();
				if(result==0)
				{
					System.out.println("No deletion performed");
				}
				else {
					System.out.println("Deletion done Sucessfully");
				}
				
			}catch(Exception e) {
				System.out.println("Exception :"+e);
			}
			
		}
		
		public void Updatestudent(beanstudent beanstud) {
			
			Connection con = DBUtil.getMySqlDBConnection();
			String sql="Update student set student_name=?, course=?, duration=?,age=? where roll_number=? ";
			try {
				
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(5, beanstud.getStudentroll());
				pst.setString(1, beanstud.getStudentname());
				pst.setString(2, beanstud.getStudentcourse());
				pst.setInt(3, beanstud.getCourseduration());
				pst.setInt(4, beanstud.getStudentage());
				int result=pst.executeUpdate();
				if(result==0) {
					System.out.println("Update not done");
				}
				else {
					System.out.println("Update done");
				}
				
				
			}catch(Exception e)
			{
				System.out.println("Exception :"+e);
			}
		}
	
	
}
