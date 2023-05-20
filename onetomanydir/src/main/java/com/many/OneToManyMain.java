package com.many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OneToManyMain {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Person person1 = new Person();
		person1.setName("Yasowant");
		person1.setPhno(7780650334l);
		person1.setGender("Male");
		person1.setAge(25);

		Person person2 = new Person();
		person2.setName("Vikash");
		person2.setPhno(7780603312l);
		person2.setGender("Male");
		person1.setAge(26);

		Bank bank1 = new Bank();
		bank1.setBname("SBI");
		bank1.setLocation("Marthahalli");
		bank1.setPhno(5667788123l);
		bank1.setIfsc("Sbinoo");
		

		Bank bank2 = new Bank();
		bank2.setBname("SBIBank");
		bank2.setLocation("Bhommahahalli");
		bank2.setPhno(6677881256l);
		bank2.setIfsc("SbinooBank");

		Bank bank3 = new Bank();
		bank3.setBname("SBIKarn");
		bank3.setLocation("Basavanagudi");
		bank3.setPhno(6778888992l);
		bank3.setIfsc("Sbinookarn");

		Bank bank4 = new Bank();
		bank4.setBname("SBINtamil");
		bank4.setLocation("Koramangala");
		bank4.setPhno(8667788565l);
		bank4.setIfsc("Sbinootamil");

		Bank bank5 = new Bank();
		bank5.setBname("SBINookoli");
		bank5.setLocation("kurnool");
		bank5.setPhno(9667788456l);
		bank5.setIfsc("SbinooKar");

		Bank bank6 = new Bank();
		bank6.setBname("SBINotdp");
		bank6.setLocation("Tadipatri");
		bank6.setPhno(2677884561l);
		bank6.setIfsc("Sbinootdp");

		List<Bank> list1 = new ArrayList<Bank>();
		list1.add(bank1);
		list1.add(bank3);
		list1.add(bank5);

		List<Bank> list2 = new ArrayList<Bank>();
		list2.add(bank2);
		list2.add(bank4);
		list2.add(bank6);

		person1.setBank(list1);
		person2.setBank(list2);

		bank1.setPerson(person1);
		bank2.setPerson(person2);
		bank3.setPerson(person1);
		bank4.setPerson(person2);
		bank5.setPerson(person1);
		bank6.setPerson(person2);

		entityTransaction.begin();
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(bank1);
		entityManager.persist(bank2);
		entityManager.persist(bank3);
		entityManager.persist(bank4);
		entityManager.persist(bank5);
		entityManager.persist(bank6);
		entityTransaction.commit();

	}
}
