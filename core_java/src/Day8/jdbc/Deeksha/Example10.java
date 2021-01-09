package Day8.jdbc.Deeksha;

import java.sql.*;
import java.util.*;

import utility.DBUtil;

public class Example10 {
	
	public static void main(String[] args) {
		
		Connection con=DBUtil.getMySqlDBConnection();
		Scanner sc=new Scanner(System.in);
		String sql="";
		System.out.println("Enter the query :");
		sql=sc.nextLine();
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			System.out.println("Enter the UserName : ");
			String userName=sc.nextLine();
			pst.setString(1,userName);	
			System.out.println("Enter the Password : ");
			String pass_word=sc.nextLine();
			pst.setString(2,pass_word);	
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{

				String u_id= rs.getString("user_id");	
				String pass= rs.getString("password");
				if(userName.equals(u_id) && (pass_word.equals(pass)))
				{
					System.out.println("Login sucessfull");
				}
				else {
				System.out.println("Login falied");
			}
			}else {
				System.out.println("Wrong Password: Login failed");
			}
			
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
		
	}

}
