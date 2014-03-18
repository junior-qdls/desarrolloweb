package com.pe.encuesta.model;

public class Respuesta {
	
	private String codigoRespuesta;
	private String value;
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public Respuesta() {
		// TODO Auto-generated constructor stub
	}
	public Respuesta(String codigoRespuesta, String value) {	
		this.codigoRespuesta = codigoRespuesta;
		this.value = value;
	}
	

}
