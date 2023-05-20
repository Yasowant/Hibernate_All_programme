package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Student student = new Student();
		student.setName("Yasowant");
		student.setAge(25);
		student.setGender("male");
		student.setMarks(95.36);

		Student student1 = new Student();
		student1.setName("Mayank");
		student1.setAge(25);
		student1.setGender("male");
		student1.setMarks(92.38);

		Course course = new Course();
		course.setName("React js");
		course.setTrainer("Nirajan Sir");
		course.setCost(15000);

		Course course1 = new Course();
		course1.setName("SQL Database");
		course1.setTrainer("Manoj Sir");
		course1.setCost(11000);

		Course course2 = new Course();
		course2.setName("Java");
		course2.setTrainer("sumaya Maam");
		course2.setCost(20000);

		Course course3 = new Course();
		course3.setName("Advance Java");
		course3.setTrainer("Akshata Maam");
		course3.setCost(20000);

		List<Course> list1 = new ArrayList<Course>();
		list1.add(course3);
		list1.add(course1);
		list1.add(course2);

		List<Course> list2 = new ArrayList<Course>();
		list2.add(course3);
		list2.add(course);
		list2.add(course1);

		List<Course> list3 = new ArrayList<Course>();
		list3.add(course);
		list3.add(course1);
		list3.add(course3);

		List<Course> list4 = new ArrayList<Course>();
		list4.add(course);
		list4.add(course1);
		list4.add(course2);

		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(course);
		entityManager.persist(course1);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityTransaction.commit();

	}

}
