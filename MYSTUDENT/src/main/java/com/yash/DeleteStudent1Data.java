package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStudent1Data {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student1 Student1 = entityManager.find(Student1.class, 103);
		
		if (Student1 != null) {
			entityTransaction.begin();
			entityManager.remove(Student1);
			entityTransaction.commit();
		} else {

			System.out.println("Data can be deleted sucessfully");

		}

	}

}
