package Day8.jdbc.Deeksha;

import java.sql.Connection;
import java.sql.*;


import utility.DBUtil;

public class Example4 {
	public static void main(String[] args) {
		Connection con=DBUtil.getMySqlDBConnection();
		//insert using statement
		String sql="insert into student values(?,?,?,?,?)";
		try {
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, 105);
			pst.setString(2, "Disha");
			pst.setString(3, "B.E");
			pst.setInt(4, 4);
			pst.setInt(5, 22);
			int result=pst.executeUpdate();
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
