package onetoone;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class getAllTheDetails {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select p from Person p");
		Query querycard=entityManager.createQuery("select c from AdharCard c");
		
		List<Person> persons=query.getResultList();
		for (Person person : persons) {
			
			System.out.println("The person id is "+ person.getId());
			System.out.println("The person name is "+ person.getName());
			System.out.println("The person age is "+ person.getAge());
			System.out.println("The person gender is "+ person.getGender());
			System.out.println("The person phone is "+ person.getPhno());
			System.out.println("The person card is "+ person.getCard());
			System.out.println("*****************************************");
			
		}
		
		List<AdharCard> cardadhar=querycard.getResultList();
		for (AdharCard adharCard : cardadhar) {
			System.out.println("The adhar card id is : "+adharCard.getId());
			System.out.println("The adhar card ad no is : "+adharCard.getAdno());
			System.out.println("The adhar card ad no is : "+adharCard.getAddress());
			System.out.println("*****************************************");
			
		}
		
	}

}
