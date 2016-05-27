package dao.impl;

import java.util.List;



import javax.persistence.Query;

import Utilitarios.conexion;
import model.jpa.Cliente;
import dao.local.ClienteDAOLocal;

public class ClienteDAOImpl implements   ClienteDAOLocal

{
	conexion cn=new conexion();	
	@Override
	public Cliente validarCliente(Cliente obj) throws Exception 
	{
		cn.abrir();
		Cliente objcliente=new Cliente();
		try 
			{			
			
			Query q1=cn.em.createQuery("select a from Cliente a where a.cliente= :p1 and a.clave=:p2");
			q1.setParameter("p1", obj.getCliente());
			q1.setParameter("p2", obj.getClave());
			List<Cliente>lista1=q1.getResultList();
			for (Cliente cliente : lista1) {
				objcliente=lista1.get(0);
			}			
		}
		catch (Exception e)
		{
		// TODO: handle exception
		}
		return objcliente;

}
}

