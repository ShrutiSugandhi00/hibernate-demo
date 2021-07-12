package com.axelor.hiberdemo.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.axelor.hiberdemo.db.Person;

public class App {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("myJpaUnit");
		EntityManager entitymanager = emfactory.createEntityManager();
		entitymanager.getTransaction().begin();
		
		Person p = entitymanager.find(Person.class,1l);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emfactory.close();
	}

}
