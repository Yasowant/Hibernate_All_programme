package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePerson {

	public static void main(String[] args) {
		EntityManagerFactory emfEntityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = emfEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Person person=new Person();
		person.setId(101);
		person.setName("Mayank");
		person.setAge(23);
		person.setGender("Male");
		person.setPhone(9354617035l);
		
		Person person1=new Person();
		person1.setId(102);
		person1.setName("Girish");
		person1.setAge(23);
		person1.setGender("Male");
		person1.setPhone(9354237355l);
		
		
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(person1);
		entityTransaction.commit();
		
		
		
		
	


	}

}
