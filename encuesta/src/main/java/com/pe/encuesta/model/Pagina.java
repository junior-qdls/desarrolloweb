package com.pe.encuesta.model;

import java.util.List;

public class Pagina {
	
	private String codigoPagina;
	private List<Pregunta> preguntas;
	private String titulo;
	private String estado;
	public String getCodigoPagina() {
		return codigoPagina;
	}
	public void setCodigoPagina(String codigoPagina) {
		this.codigoPagina = codigoPagina;
	}
	public List<Pregunta> getPreguntas() {
		return preguntas;
	}
	public void setPreguntas(List<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Pagina() {
		// TODO Auto-generated constructor stub
	}
	public Pagina(String codigoPagina, List<Pregunta> preguntas, String titulo,
			String estado) {
	
		this.codigoPagina = codigoPagina;
		this.preguntas = preguntas;
		this.titulo = titulo;
		this.estado = estado;
	}
	

}
