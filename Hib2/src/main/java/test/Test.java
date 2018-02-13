package test;

import java.util.List;

import javax.persistence.*;

import model.*;


public class Test {

	public static void main(String[] args) {
		
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("formation-jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		String nom="Abid";
		Query req=em.createQuery("FROM Eleve where nom='"+nom+"' order by prenom");
		List<Eleve> lst=req.getResultList();
		
		
		tx.commit();
		em.close();
		emf.close();
	

		for(Eleve e:lst){System.out.println(e);}
	}

}
