package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePersonData {

	public static void main(String[] args) {
		EntityManagerFactory emfEntityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = emfEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person=entityManager.find(Person.class,102);
		if(person!=null)
		{
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
		}else 
		{
			System.out.println("Data can be delete");
		}
		

	}

}
