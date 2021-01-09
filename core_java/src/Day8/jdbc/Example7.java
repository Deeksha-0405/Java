package Day8.jdbc;

import java.sql.*;
import java.util.*;

import utility.DBUtil;

public class Example7 {
	
	public static void main(String[] args) {
	//	String userName = "Deeksha";
		//String password = "dee_04";
		Scanner sc=new Scanner(System.in);
		Connection con=DBUtil.getMySqlDBConnection();
		try {
			String sql="select * from login where user_id=? and password=? ";
			PreparedStatement pst=con.prepareStatement(sql);
			
			System.out.println("Enter the UserName : ");
			String userName=sc.nextLine();
			pst.setString(1,userName);	
			System.out.println("Enter the Password : ");
			String pass_word=sc.nextLine();
			pst.setString(2,pass_word);	
			
			ResultSet result=pst.executeQuery();
			
			while(result.next()) {
				String u_id= result.getString("user_id");	
				String pass= result.getString("password");
				if(userName.equals(u_id) && (pass_word.equals(pass)))
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