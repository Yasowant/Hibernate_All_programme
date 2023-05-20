package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudent1Data {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Student1 Student1=new Student1();
		Student1.setId(100);
		Student1.setName("Yasowant");
		Student1.setAge(23);
		Student1.setGender("Male");
		Student1.setPhno(9354617055l);
		Student1.setMarks(85);
		
		Student1 Student11=new Student1();
		Student11.setId(101);
		Student11.setName("Yash");
		Student11.setAge(24);
		Student11.setGender("Male");
		Student11.setPhno(9354616055l);
		Student11.setMarks(95);
		
		Student1 Student12=new Student1();
		Student12.setId(102);
		Student12.setName("Abdul");
		Student12.setAge(25);
		Student12.setGender("Male");
		Student12.setPhno(9354317055l);
		Student12.setMarks(95);
		
		
		Student1 Student13=new Student1();
		Student13.setId(103);
		Student13.setName("Mayank");
		Student13.setAge(25);
		Student13.setGender("Male");
		Student13.setPhno(9354617095l);
		Student13.setMarks(75);
		
		Student1 Student14=new Student1();
		Student14.setId(104);
		Student14.setName("Disney");
		Student14.setAge(22);
		Student14.setGender("FeMale");
		Student14.setPhno(9334617055l);
		Student14.setMarks(95);
		
		
		entityTransaction.begin();
		
		entityManager.persist(Student1);
		entityManager.persist(Student11);
		entityManager.persist(Student12);
		entityManager.persist(Student13);
		entityManager.persist(Student14);
		
		entityTransaction.commit();
		
		
		
		

	}

}
