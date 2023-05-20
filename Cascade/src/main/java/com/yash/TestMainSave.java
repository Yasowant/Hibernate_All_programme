package com.yash;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestMainSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Hospital hospital=new Hospital();
		hospital.setName("Appollo");
		hospital.setWebsite("www.appollo.com");
		hospital.setLoc("BBSR");
		hospital.setNoBranches(50);
		
		Hospital hospital1=new Hospital();
		hospital1.setName("jaydev");
		hospital1.setWebsite("www.jaydev.com");
		hospital1.setLoc("Rourkela");
		hospital1.setNoBranches(80);
		
		Branch branch=new Branch();
		branch.setName("Jayedev Vihar");
		branch.setLoc("near busstand");
		branch.setNoOfDoc(80);
		
		Branch branch1=new Branch();
		branch1.setName("Prasant Vihar");
		branch1.setLoc("near busstand");
		branch1.setNoOfDoc(40);
		
		Branch branch2=new Branch();
		branch2.setName("Dav");
		branch2.setLoc("near busstand");
		branch2.setNoOfDoc(30);
		
		Branch branch3=new Branch();
		branch3.setName("Bisra");
		branch3.setLoc("near Railwaystation");
		branch3.setNoOfDoc(50);
		
		List<Branch> list=new ArrayList<Branch>();
		list.add(branch);
		list.add(branch1);
		
		List<Branch> list1=new ArrayList<Branch>();
		list1.add(branch2);
		list1.add(branch3);
		
		hospital.setBranches(list);
		hospital1.setBranches(list1);
		
		
		branch.setHospitals(hospital);
		branch1.setHospitals(hospital);
		branch2.setHospitals(hospital1);
		branch3.setHospitals(hospital1);
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityManager.persist(hospital1);
		entityTransaction.commit();


		

	}

}
