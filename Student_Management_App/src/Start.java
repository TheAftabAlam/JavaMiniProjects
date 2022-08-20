import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		System.out.println("Welcome to Student Management App");
		Scanner scanner=new Scanner(System.in);
		while(true)
		{
			System.out.println("Press 1 for Add Student");
			System.out.println("Press 2 for Delete Student");
			System.out.println("Press 3 for Display Student");
			System.out.println("Press 4 for Update Student");
			System.out.println("Press 5 for Exit");
			System.out.println("*****************************");
			int choice=scanner.nextInt();
			if(choice==1)
			{
				//Add student
				System.out.println("Enter Student Name");
				scanner.nextLine();
				String nameString=scanner.nextLine();
				
				
				System.out.println("Enter Student Phone");
				
				String phoneString=scanner.nextLine();
				
				System.out.println("Enter Student City");
				
				String cityString=scanner.nextLine();
				
				Student student=new Student(nameString, phoneString, cityString);
				boolean ans=StudentDau.insertStudenttoDB(student);
				if(ans)
					System.out.println("Student is added successfully");
				else {
					System.out.println("Something went wrong, Please try again");
				}
				
			}
			if(choice==2)
			{
				// Delete Student
				System.out.println("Enter Student Id");
				int id=scanner.nextInt();
				Boolean boolean1=StudentDau.deletestudent(id);
				if(boolean1)
					System.out.println("Student delete successfully");
				else
					System.out.println("Something went wrong, Please try again");
				
			}
			if(choice==3)
			{
				//Display All student
				 StudentDau.showAll();
				 
			}
			if(choice==4)
			{
				//update
				System.out.println("Enter Student Id");
				int id=scanner.nextInt();
				System.out.println("Enter name");
				String nameString=scanner.next();
				System.out.println("Enter Phone Number");
				String numString=scanner.next();
				System.out.println("Enter City");
				String cityString=scanner.next();
				StudentDau.updatestudent(id,nameString,numString,cityString);
			}
			if(choice==5)
			{
				break;
			}
		}
		System.out.println("Thank You for Connecting");
		scanner.close();
	}
}
