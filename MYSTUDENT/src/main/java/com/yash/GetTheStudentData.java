package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetTheStudentData {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student1 student = entityManager.find(Student1.class, 104);

		System.out.println("The Student id is :" + student.getId());
		System.out.println("The Student Name is :" + student.getName());
        System.out.println("The Student Age is :" + student.getAge());
		System.out.println("The Student Gender is :" + student.getGender());
		System.out.println("The Student Marks is :" + student.getMarks());
		System.out.println("The Student Phno is :" + student.getPhno());

	}

}
