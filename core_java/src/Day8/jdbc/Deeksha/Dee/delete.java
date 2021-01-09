package Day8.jdbc.Deeksha.Dee;

import java.sql.*;

import utility.DBUtil;

public class delete {
	
	public static void main(String[] args) {
		
		Connection con=DBUtil.getMySqlDBConnection();
		String sql="delete from login where user_id='User'";
		
		
		try {
			
			PreparedStatement pst=con.prepareStatement(sql);
			int result=pst.executeUpdate();
			if(result==0)
			{
				System.out.println("No changes");
			}
			else {
				System.out.println("Changes done");
			}
			
			
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
	}

}
