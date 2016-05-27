package jsf.bean;

import java.sql.Date;

import dao.impl.ClienteDAOImpl;
import model.jpa.Cliente;

public class ClienteBean

{
	public String cliente, clave;
	public Date		f_registro;
	public ClienteDAOImpl clienteDAOImpl = new ClienteDAOImpl();
	
	
	Cliente obj=new Cliente();
	public String validar_login() throws Exception
	{
		String validacion="ERROR";
		Cliente objCliente=new Cliente();
		objCliente.setCliente(getCliente());
		objCliente.setClave(getClave());
		obj=clienteDAOImpl.validarCliente(objCliente);
		if (obj!=null && obj.getCliente()!=null)
		{
			validacion="EXITO";
			setCliente(obj.getCliente());
			setClave(obj.getClave());
		}
		return validacion;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getF_registro() {
		return f_registro;
	}

	public void setF_registro(Date f_registro) {
		this.f_registro = f_registro;
	}

	public ClienteDAOImpl getClienteDAOImpl() {
		return clienteDAOImpl;
	}

	public void setClienteDAOImpl(ClienteDAOImpl clienteDAOImpl) {
		this.clienteDAOImpl = clienteDAOImpl;
	}
		
	}

