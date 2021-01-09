package Day8.jdbc.Deeksha;

import java.sql.*;

import utility.DBUtil;

public class Example3 {
	public static void main(String[] args) {
		Connection con=DBUtil.getMySqlDBConnection();
		//insert using statement
		String sql="insert into student values(104,'Funji','M.E',2,23)";
		try {
			Statement st=con.createStatement();
			int result=st.executeUpdate(sql);
			if(result==0) {
				System.out.println("Not Inserted");
			}
			else {
				System.out.println("Inserted sucessfully");
			}
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		
	}

}
