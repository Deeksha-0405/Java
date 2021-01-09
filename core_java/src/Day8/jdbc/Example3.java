package Day8.jdbc;

import java.sql.*;

//insert into using statement
public class Example3 {
	
	public static void main(String[] args) {
		Connection con=getMySqlDBConnection();
		String sql ="insert into login values('Zensar','zen_99')";
		try {
			Statement st=con.createStatement();
			int result=st.executeUpdate(sql); // this method can be used for insert/update/delete queries
			if(result==0) {
				System.out.println("Nothing inserted");
			}
			else {
				System.out.println("Inserted Sucessfully");
			}
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
	}
	
	public static Connection getMySqlDBConnection()
	{
		String driverClassName="com.mysql.jdbc.Driver";
		String Url="jdbc:mysql://localhost:3306/java_training";
		String dbUserName="root";
		String dbPassword="root";
		Connection con=null;
		try {
			Class.forName(driverClassName);
			con=DriverManager.getConnection(Url, dbUserName,dbPassword);
		} catch (Exception e) {
			System.out.println("Exception Occured : "+e);
		}
		return con;
	}

}
