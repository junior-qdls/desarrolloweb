package com.pe.encuesta.model;

import java.util.List;

public class Encuesta {
	
	private String codigoEncuesta;
	public String getCodigoEncuesta() {
		return codigoEncuesta;
	}
	public void setCodigoEncuesta(String codigoEncuesta) {
		this.codigoEncuesta = codigoEncuesta;
	}

	private String nombre;
	private String descripcion;
	private String estado;
	private List<Pagina> paginas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public List<Pagina> getPaginas() {
		return paginas;
	}
	public void setPaginas(List<Pagina> paginas) {
		this.paginas = paginas;
	}
	public Encuesta(String nombre, String descripcion, String estado,
			List<Pagina> paginas,String codigoEncuesta) {	
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
		this.paginas = paginas;
		this.codigoEncuesta=codigoEncuesta;
	}
	
	public Encuesta() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
