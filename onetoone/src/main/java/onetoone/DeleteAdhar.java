package onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class DeleteAdhar {

	public static void main(String[] args) {
		EntityManagerFactory emfEntityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = emfEntityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		AdharCard adhar=entityManager.find(AdharCard.class,2);
		
		if(adhar!=null)
		{
			entityTransaction.begin();
			entityManager.remove(adhar);
			entityTransaction.commit();
		}else 
		{
			System.out.println("Data can be delete");
		}
		

	}

}
