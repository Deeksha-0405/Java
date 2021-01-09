package Day8.jdbc;

import java.sql.*;

import utility.DBUtil;

public class Example5 {
	
	public static void main(String[] args) {
		String userName = "Deeksha";
		String password = "dee_04";
		
		Connection con=DBUtil.getMySqlDBConnection();
		try {
			String sql="select * from login where user_id=? ";
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1,userName);		
			ResultSet result=pst.executeQuery();
			
			while(result.next()) {
				String u_id= result.getString("user_id");	
				String pass= result.getString("password");
				if(userName.equals(u_id) && (password.equals(pass)))
				{
					System.out.println("Login sucessfull");
				}
				else {
				System.out.println("Login falied");
			}
			
		    }
		
		}catch(Exception e) {
				System.out.println("Exception : "+e);
			   }

}
}