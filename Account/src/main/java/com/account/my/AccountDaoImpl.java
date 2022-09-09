package com.account.my;


import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class AccountDaoImpl implements AccountDao{

	public Account findById(int id) {
		Account account=null;
		EntityManager entityManager=Persistence
				.createEntityManagerFactory("AccountUnit")
				.createEntityManager();
		account= entityManager.find(Account.class, id);
		return account;
	}

	public String save(Account account) {
		String string=null;
		
		EntityManager entityManager=Persistence
				.createEntityManagerFactory("AccountUnit")
				.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(account);
		entityManager.getTransaction().commit();
		
		string="Account added successfully";
		
		
		
		return string;
	}

	public String update(Account account) {
		
		String string=null;
		EntityManager entityManager=Persistence
				.createEntityManagerFactory("AccountUnit")
				.createEntityManager();
		Account account2= entityManager.find(Account.class, account.getId());
		
		if(account2==null)
		{
			string="Accoun does not exist";
		}
		else {
			entityManager.getTransaction().begin();
			
			account2.setId(002);
			account2.setEmail("newemail@masai.com");
			account2.setBalance(300000.00);
			account2.setAddress("Banglore");
			string="Account updated successfully";
		}
		return string;
	}

	public String remove(int id) {
		String string=null;
		EntityManager entityManager=Persistence
				.createEntityManagerFactory("AccountUnit")
				.createEntityManager();
		Account account2= entityManager.find(Account.class, id);
		
		if(account2==null)
		{
			string="Accoun does not exist";
		}
		else {
			entityManager.getTransaction().begin();
			entityManager.remove(account2);
			string="Accoount removed";
		}
		return string;
	}

	public String withdraw(double amount, int accountId) {
		String string=null;
		EntityManager entityManager=Persistence
				.createEntityManagerFactory("AccountUnit")
				.createEntityManager();
		Account account2= entityManager.find(Account.class, accountId);
		
		if(account2==null)
		{
			 string="Accoun does not exist";
		}
		else {
			
			
			if(amount<=account2.getBalance())
			{
				entityManager.getTransaction().begin();
				account2.setBalance(account2.getBalance()-amount);
				entityManager.getTransaction().commit();
				string="Accoun Balance withdraw";
				
			}
			else {
				string="Accoun Balance is too low";
			}
			
			
			
		}
		return string;
	}

	public String deposit(double amount, int accountId) {
		String string;
		EntityManager entityManager=Persistence
				.createEntityManagerFactory("AccountUnit")
				.createEntityManager();
		Account account2= entityManager.find(Account.class, accountId);
		
		if(account2==null)
		{
			string="Accoun does not exist";
		}
		else {
			
			entityManager.getTransaction().begin();
			account2.setBalance(account2.getBalance()+amount);
			entityManager.getTransaction().commit();
			string="account deposite added";
		}
		return string;
	}

}
