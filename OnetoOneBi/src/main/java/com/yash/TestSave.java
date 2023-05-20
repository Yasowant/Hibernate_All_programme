package com.yash;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Company company1 = new Company();
		company1.setName("jspider");
		company1.setWebsite("www.jspider.com");
		company1.setLocation("Banglore");

		Company company2 = new Company();
		company2.setName("Qspider");
		company2.setWebsite("www.Qspider.com");
		company2.setLocation("chennai");

		Gst gst1 = new Gst();
		gst1.setGstno("AB1234");
		gst1.setState("Ap");
		gst1.setCountry("India");

		Gst gst2 = new Gst();
		gst2.setGstno("AB4321");
		gst2.setState("Ts");
		gst2.setCountry("India");

		company1.setGst(gst1);
		company2.setGst(gst2);
		gst1.setCompany(company1);
		gst2.setCompany(company2);

		entityTransaction.begin();
		entityManager.persist(company1);
		entityManager.persist(company2);
		entityManager.persist(gst1);
		entityManager.persist(gst2);
		entityTransaction.commit();

	}

}
