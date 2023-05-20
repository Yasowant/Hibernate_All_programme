package com.yash;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {
	public static void main(String[] args) throws IOException {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("Yasowant");
		person.setAge(25);
		person.setGender("Male");
		person.setDob(new Date());
		FileInputStream fis=new FileInputStream("src/main/java/fav.jpg");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		person.setImage(data);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		
		
		
	}

}
