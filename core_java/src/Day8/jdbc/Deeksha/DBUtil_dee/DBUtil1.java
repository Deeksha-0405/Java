package Day8.jdbc.Deeksha.DBUtil_dee;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil1 {

public static Connection mySqlConnection(){
		
		String driverClassName="com.mysql.jdbc.Driver";
		String Url="jdbc:mysql://localhost:3306/java_training";
		String dbUserName="root";
		String dbPassword="root";
		Connection con=null;
		
		try {
			Class.forName(driverClassName);
			con=DriverManager.getConnection(Url, dbUserName, dbPassword);
		}catch(Exception e) {
			System.out.println("Exception : "+e);
		}
		
		return con;		
	}

}
