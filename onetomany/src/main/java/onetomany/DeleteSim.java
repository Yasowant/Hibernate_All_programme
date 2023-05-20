package onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteSim {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Mobile mobile=entityManager.find(Mobile.class,2);
		
		
		if(mobile!=null)
		{
			Sim sim=entityManager.find(Sim.class,3);
			entityTransaction.begin();
			entityManager.remove(sim);
			entityTransaction.commit();
			
		}else {
			System.out.println("Data can be delete");
		}
	
		

	}

}
