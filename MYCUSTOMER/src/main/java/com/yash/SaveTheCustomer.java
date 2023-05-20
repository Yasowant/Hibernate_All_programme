package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveTheCustomer {

	public static void main(String[] args) {
		EntityManagerFactory emfEntityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = emfEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Customer customer = new Customer();
		customer.setName("Yasowant");
		customer.setAge(25);
		customer.setGender("Male");
		customer.setPhno(9354617055l);
		customer.setEmail("yasowant1998@gmail.com");

		Customer customer1 = new Customer();
		customer1.setName("Yash");
		customer1.setAge(25);
		customer1.setGender("Male");
		customer1.setPhno(9438591905l);
		customer1.setEmail("yash1998@gmail.com");

		Customer customer2 = new Customer();
		customer2.setName("Vikash");
		customer2.setAge(26);
		customer2.setGender("Male");
		customer2.setPhno(9344617055l);
		customer2.setEmail("vikashdubey1998@gmail.com");

		Customer customer3 = new Customer();
		customer3.setName("Abdul");
		customer3.setAge(25);
		customer3.setGender("Male");
		customer3.setPhno(9354610055l);
		customer3.setEmail("abdul1998@gmail.com");

		Customer customer4 = new Customer();
		customer4.setName("Disney");
		customer4.setAge(23);
		customer4.setGender("FeMale");
		customer4.setPhno(9354317055l);
		customer4.setEmail("Disney1998@gmail.com");

		entityTransaction.begin();
		entityManager.persist(customer);
		entityManager.persist(customer1);
		entityManager.persist(customer2);
		entityManager.persist(customer3);
		entityManager.persist(customer4);
		entityTransaction.commit();

	}

}
