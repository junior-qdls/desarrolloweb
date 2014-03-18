package com.pe.encuesta.model;

import java.util.List;

public class Usuario {
	
	
	
	private String username;
	private String nombre;
	private String apellidos;
	public String getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(String codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	private String codigoUsuario;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public List<Encuesta> getEncuestas() {
		return encuestas;
	}
	public void setEncuestas(List<Encuesta> encuestas) {
		this.encuestas = encuestas;
	}
	private String clave;
	private List<Encuesta> encuestas;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	public Usuario(String username, String nombre, String apellidos,
			String clave,String codigoUsuario, List<Encuesta> encuestas) {	
		this.username = username;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.clave = clave;
		this.encuestas = encuestas;
		this.codigoUsuario=codigoUsuario;
	}
	
	
}
