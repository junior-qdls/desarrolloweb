package com.pe.encuesta.model;

public class EncuestaResult {

	private int codeMessage;
	private String message;
	private String value;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getCodeMessage() {
		return codeMessage;
	}
	public void setCodeMessage(int codeMessage) {
		this.codeMessage = codeMessage;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public EncuestaResult() {
		// TODO Auto-generated constructor stub
	}
	public EncuestaResult(int codeMessage, String message,String value) {	
		this.codeMessage = codeMessage;
		this.message = message;
	}
	
}
