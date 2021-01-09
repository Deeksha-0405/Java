package Day8.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utility.DBUtil;

public class Example8 {
	
	public static void main(String[] args) {
		String userName = "Deeksha";
		
		
		Connection con=DBUtil.getMySqlDBConnection();
		try {
			String sql="select user_id from login ";
			
			PreparedStatement pst=con.prepareStatement(sql);
		//	pst.setString(userName);		
			ResultSet result=pst.executeQuery();
			
			while(result.next()) {
				String u_id= result.getString("user_id");	
				System.out.println(u_id);
			
		    }
		
		}catch(Exception e) {
				System.out.println("Exception : "+e);
			   }

}

}
