package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory emfEntityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = emfEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Customer customer=new Customer();
		customer.setName("Yasowant");
		customer.setAge(24);
		customer.setPhno(9354617055l);
		customer.setSal(95000);
		
		Customer customer1=new Customer();
		customer1.setName("Abdul");
		customer1.setAge(26);
		customer1.setPhno(9354617555l);
		customer1.setSal(85000);
		
		Pan pan=new Pan();
		pan.setPanNo("BSBPN9505M");
		pan.setState("Odisha");
		pan.setCountry("India");
		pan.setAddress("Rourkela");
		
		
		Pan pan1=new Pan();
		pan1.setPanNo("BSBPN8505M");
		pan1.setState("Karnataka");
		pan1.setCountry("India");
		pan1.setAddress("mysore");
		
		customer.setPans(pan);
		customer1.setPans(pan1);
		
		
		entityTransaction.begin();
		entityManager.persist(customer);
		entityManager.persist(customer1);
		entityManager.persist(pan);
		entityManager.persist(pan1);
		entityTransaction.commit();
				
		
		
		
	}

}
