package com.pe.encuesta.model;

import java.util.List;

public class Pregunta {

	private List<Respuesta> respuestas;
	private String codigoPregunta;
	public List<Respuesta> getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(List<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}
	public String getCodigoPregunta() {
		return codigoPregunta;
	}
	public void setCodigoPregunta(String codigoPregunta) {
		this.codigoPregunta = codigoPregunta;
	}
	public Pregunta(List<Respuesta> respuestas, String codigoPregunta) {	
		this.respuestas = respuestas;
		this.codigoPregunta = codigoPregunta;
	}
	public Pregunta() {
		// TODO Auto-generated constructor stub
	}
	
}
