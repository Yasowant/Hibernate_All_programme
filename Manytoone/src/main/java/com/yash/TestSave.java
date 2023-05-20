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

		State state = new State();
		state.setName("Odisha");
		state.setCapital("BBSR");
		state.setLang("Odia");
		state.setCm("Nabin Pattanaik");

		State state1 = new State();
		state1.setName("Karnataka");
		state1.setCapital("Bangaluru");
		state1.setLang("Kannda");
		state1.setCm("shivkumar");

		Country country = new Country();
		country.setName("India");
		country.setCapital("Delhi");
		country.setPm("Modhi");

		state.setCountry(country);
		state.setCountry(country);

		entityTransaction.begin();
		entityManager.persist(country);
		entityManager.persist(state);
		entityManager.persist(state1);
		entityTransaction.commit();

	}

}
