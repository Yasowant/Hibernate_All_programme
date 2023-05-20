package com.yash;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class GetCustomerDetails {

	public static void main(String[] args) {
		EntityManagerFactory emfEntityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = emfEntityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select s from Customer s");
		
		List<Customer> customers=query.getResultList();
		for (Customer customer : customers) {
			System.out.println("The Customer Id is "+customer.getId());
			System.out.println("The Customer Name is "+customer.getName());
			System.out.println("The Customer Age is "+customer.getAge());
			System.out.println("The Customer Gender is "+customer.getGender());
			System.out.println("The Customer  Phone No is "+customer.getPhno());
			System.out.println("The Customer Email  is "+customer.getEmail());
			System.out.println("*****************************************");
			
			
		}
		
			
		
		
		

	}

}
