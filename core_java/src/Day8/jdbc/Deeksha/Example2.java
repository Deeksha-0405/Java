package Day8.jdbc.Deeksha;

import java.sql.*;

import Day8.jdbc.Deeksha.DBUtil_dee.DBUtil1;

public class Example2 {
	
	public static void main(String[] args) {
		
		Connection con =DBUtil1.mySqlConnection();
		
		String sql="select * from student";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				int roll=rs.getInt("roll_number");
				String name=rs.getString("student_name");
				String course=rs.getString("course");
				int duration=rs.getInt("duration");
				int age=rs.getInt("age");
				System.out.println("Roll No :"+roll+"\nName :"+name+"\nCourse :"+course+"\nDuration :"+duration+"\nage :"+age);
				System.out.println("===========================================");
			}
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		
	}

}
