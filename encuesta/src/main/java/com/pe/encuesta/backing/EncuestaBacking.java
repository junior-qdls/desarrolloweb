package com.pe.encuesta.backing;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.pe.encuesta.service.EncuestaService;



@Named("encuestaBean")
@RequestScoped
public class EncuestaBacking {
	
	
	@Inject
	public EncuestaService encuestaService;
	
	
	

}
