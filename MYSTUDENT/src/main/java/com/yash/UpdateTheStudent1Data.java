package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateTheStudent1Data {

	public static void main(String[] args) {
		EntityManagerFactory emfEntityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = emfEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Student1 Student1 = entityManager.find(Student1.class, 104);
		
		if(Student1!=null)
		{
			Student1.setMarks(100);
			entityTransaction.begin();
			entityManager.merge(Student1);
			entityTransaction.commit();
			
		}
		else 
		{
			System.out.println("Data is not found");
		}

	}

}
