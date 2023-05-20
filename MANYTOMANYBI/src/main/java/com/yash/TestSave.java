package com.yash;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("Yasowant Nayak");
		person.setAge(25);
		person.setPhno(9354617055l);
		person.setGender("Male");
		
		Person person1=new Person();
		person1.setName("Mayank Singh");
		person1.setAge(26);
		person1.setPhno(9354677055l);
		person1.setGender("Male");
		
		Cab cab=new Cab();
		cab.setDname("Vikash");
		cab.setType("AC");
		cab.setCost(2000);
		cab.setPhone(9354617065l);
		
		Cab cab1=new Cab();
		cab1.setDname("Vikash Dubey");
		cab1.setType("AC");
		cab1.setCost(2500);
		cab1.setPhone(9354317065l);
		
		Cab cab2=new Cab();
		cab2.setDname("Yash");
		cab2.setType("AC");
		cab2.setCost(2200);
		cab2.setPhone(9344317065l);
		
		List<Person> list=new ArrayList<Person>();
		list.add(person);
		
		List<Person> list1=new ArrayList<Person>();
		list1.add(person1);
		
		List<Cab> list2=new ArrayList<Cab>();
		list2.add(cab2);
		list2.add(cab1);
		list2.add(cab);
		
	    List<Cab> list3=new ArrayList<Cab>();
		list3.add(cab1);
		list3.add(cab);
		
		person.setCabs(list3);
		person1.setCabs(list2);
		
		cab.setPersons(list1);
		cab1.setPersons(list);
		cab2.setPersons(list);
		
		
		
		
		entityTransaction.begin();
		
		entityManager.persist(person);
		entityManager.persist(person1);
		entityManager.persist(cab);
		entityManager.persist(cab1);
		entityManager.persist(cab2);
		
		entityTransaction.commit();
		
		
	
		
	
		
		
		

	}

}
