import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class StudentDau {
		
	public static boolean insertStudenttoDB(Student s)
	
	{	
		boolean flag=false;

		try {
			Connection connection=CP.create();
			String qString="insert into student(s_name, s_phone, s_city) values(?,?,?)";
			
			PreparedStatement pstmt= connection.prepareStatement(qString);
			
			pstmt.setString(1, s.getS_nameString());
			pstmt.setString(2, s.getS_phoneString());
			pstmt.setString(3, s.getS_cityString());
			
			pstmt.execute();
			flag=true;
			
			
		} catch (Exception e) {
			
		}
		return flag;
	}

	public static boolean deletestudent(int id) {
		{	
			boolean flag=false;

			try {
				Connection connection=CP.create();
				String qString="delete from student where s_id=?";
				
				PreparedStatement pstmt= connection.prepareStatement(qString);
				
				pstmt.setInt(1, id);
				
				
				pstmt.execute();
				flag=true;
				
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			return flag;
		}

		
		
	}

	public static void showAll() {
		
		try {

			Connection connection=CP.create();
			String qString="select * from student";
			java.sql.Statement statement=connection.createStatement();
			
			ResultSet set= statement.executeQuery(qString);
			
			while(set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String phoneString=set.getString(3);
				String cityString=set.getString(4);
				
				System.out.println("ID: "+id);
				System.out.println("Name: "+name);
				System.out.println("Phone: "+phoneString);
				System.out.println("City: "+cityString);
				System.out.println("===============================");
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	public static void updatestudent(int id ,String nameString,String numString,String cityString) {
		
		try 
		{
			Connection connection=CP.create();
			String q="update student set s_name=?,s_phone=?,s_city=? where s_id=?";
			
			PreparedStatement pstmt=connection.prepareStatement(q);
			
			
			
			pstmt.setString(1, nameString);
			pstmt.setString(2, numString);
			pstmt.setString(3, cityString);
			pstmt.setInt(4, id);
			
			int x= pstmt.executeUpdate();
			
			if(x>0)
			{
				System.out.println(x+" updated.");
				
			}
			else {
				System.out.println("Not updated Try Again");
			}
			System.out.println("Thankxxxx");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
	
}
