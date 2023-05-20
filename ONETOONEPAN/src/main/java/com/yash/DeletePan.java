package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class DeletePan {

	public static void main(String[] args) {
		EntityManagerFactory emfEntityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = emfEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Customer customer=entityManager.find(Customer.class,2);
		
		if(customer!=null)
		{
			Pan pan=entityManager.find(Pan.class,2);
			entityTransaction.begin();
			entityManager.remove(customer);
			entityManager.remove(pan);
		    entityTransaction.commit();
		}else 
		{
			System.out.println("Data can be delete");
		}
		

	}

}
