package Day8.jdbc;

import java.sql.*;
import java.sql.DriverManager;

//Demo jdbc connectivity

public class Example1 {
	
	public static void main(String[] args) {
		String driverClassName="com.mysql.jdbc.Driver";
		String Url="jdbc:mysql://localhost:3306/java_training";
		String dbUserName="root";
		String dbPassword="root";
		
		try {
			Class.forName(driverClassName);
			Connection con=DriverManager.getConnection(Url, dbUserName,dbPassword);
			System.out.println("Connection : "+con);
			// To print the query from the database to console
			
			String sql="Select * from login";
			// to execute this there are total two ways
			//Statement or prepared statement
			//First giving demo using statement
			Statement st =con.createStatement();
			ResultSet rs= st.executeQuery(sql);
			while(rs.next())
			{
				String username=rs.getString("user_id");
				String password=rs.getString("password");
				System.out.println("User Name : "+username);
				System.out.println("Password : "+password);
				System.out.println("**************************");
			}
			
			
		} catch (Exception e) {
			System.out.println("Exception Occured : "+e);
		}
		
	}

}
