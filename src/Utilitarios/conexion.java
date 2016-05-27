package Utilitarios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class conexion 
{
	public EntityManager em;
	public EntityManagerFactory emf;
	
	public void abrir()

	{
		
		emf=Persistence.createEntityManagerFactory("Cliente");
		em=emf.createEntityManager();
	}
	public void cerrar()
	{
		em.close();
		emf.close();
	}

}
