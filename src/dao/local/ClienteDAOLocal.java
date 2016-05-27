package dao.local;

import model.jpa.Cliente;


public interface ClienteDAOLocal 

{
	public abstract Cliente validarCliente(Cliente obj) throws Exception;
	//public abstract Cliente buscarUsuario(Cliente obj) throws Exception;
	//public abstract void agregarCliente(Cliente obj) throws Exception;
	//public abstract void modificarCliente(Cliente obj) throws Exception;
	//public abstract List<Cliente> buscarListaCliente(Cliente obj) throws Exception;
}
