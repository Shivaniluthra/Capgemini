package config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MyFactory {
	private static EntityManagerFactory emf;
	static {
		emf= Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}