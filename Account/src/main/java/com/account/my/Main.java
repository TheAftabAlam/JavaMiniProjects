package com.account.my;

import java.util.Scanner;

public class Main {
		
	public static void main(String[] args) {
		System.out.println("Press 1 findById");
		System.out.println("Press 2 save");
		System.out.println("Press 3 update");
		System.out.println("Press 4 remove");
		System.out.println("Press 5  withdraw");
		System.out.println("Press 6 deposit");
		AccountDao accountDao=new AccountDaoImpl();
		try(Scanner scanner=new Scanner(System.in)) {
			
			int c=scanner.nextInt();
			if(c==1)
			{
				System.out.println("Enter id");
				int id=scanner.nextInt();
				Account account= accountDao.findById(id);
				if(account!=null)
				{
					System.out.println(account);
				}
				else {
					System.out.println("Account does not exist");
				}
			}
			if(c==2)
			{
				System.out.println("enter id");
				int id=scanner.nextInt();
				System.out.println("enter email");
				String emailString=scanner.next();
				System.out.println("enter address");
				String addString=scanner.next();
				System.out.println("enter salary");
				 double d=scanner.nextDouble();			
				 Account account=new Account(id,emailString,addString,d);
				 accountDao.save(account);
				 System.out.println("account added");
				}
			if(c==3)
			{
				System.out.println("enter id");
				int id=scanner.nextInt();
				System.out.println("enter email");
				String emailString=scanner.next();
				System.out.println("enter address");
				String addString=scanner.next();
				System.out.println("enter salary");
				 double d=scanner.nextDouble();			
				 Account account=new Account(id,emailString,addString,d);
				 String reString= accountDao.update(account);
				 System.out.println(reString);
			}
			if(c==4)
			{
				System.out.println("Enter id");
				int id=scanner.nextInt();
				String string=accountDao.remove(id);
				System.out.println(string);
			}
			if(c==5)
			{

				System.out.println("Enter id");
				int id=scanner.nextInt();
				System.out.println("Enter balance");
				double d=scanner.nextDouble();
				String string= accountDao.withdraw(d, id);
				System.out.println(string);
			}
			if(c==6)
			{
				System.out.println("Enter id");
				int id=scanner.nextInt();
				System.out.println("Enter balance");
				double d=scanner.nextDouble();
				String string= accountDao.deposit(d, id);
				System.out.println(string);
			}
			
			
			
		} 
		
	}

}
