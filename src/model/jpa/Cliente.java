package model.jpa;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="tbl_cliente")
public class Cliente 


{
	@Id
	private String cliente;
	private String clave;
	private String tipo;

	@Temporal(TemporalType.DATE)

	@Column(name="f_registro")
	
	private Date f_registro;
	private Integer estado;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getF_registro() {
		return f_registro;
	}
	public void setF_registro(Date f_registro) {
		this.f_registro = f_registro;
	}
	public Integer getEstado() {
		return estado;
	}
	public void setEstado(Integer estado) {
		this.estado = estado;
	}
	

}
