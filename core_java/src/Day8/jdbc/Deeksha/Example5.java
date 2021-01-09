package Day8.jdbc.Deeksha;

import java.sql.*;

import utility.DBUtil;

public class Example5 {
	
	public static void main(String[] args) {
		
		Connection con=DBUtil.getMySqlDBConnection();
		int Rollno=101;
		String sql="select * from student where roll_number=? ";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, Rollno);
			ResultSet result=pst.executeQuery();
			if(result.next())
			{
				int roll=result.getInt("roll_number");
				if(Rollno==roll)
				{
					System.out.println("Found");
				}
				else {
					System.out.println("Not found");
				}
				
			}else {
				System.out.println("No such Roll number");
			}
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		
		
	}

}
