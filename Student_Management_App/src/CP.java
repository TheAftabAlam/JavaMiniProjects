import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
	static Connection connection;

	public static Connection create()
	{
		
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			String user="root";
			String password="9935895648";
			String url="jdbc:mysql://localhost:3306/student_management";
			
			
			try {
				connection=DriverManager.getConnection(url,user,password);
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
		} 
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return connection;
	}
	
}
