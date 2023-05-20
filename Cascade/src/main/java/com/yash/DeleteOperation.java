package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteOperation {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Hospital hospital=entityManager.find(Hospital.class,2);
		if( hospital!=null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			
		}
		else {
			System.out.println("Data can be delete");
		}
		

	}

}
