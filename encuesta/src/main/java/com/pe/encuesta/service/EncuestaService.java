package com.pe.encuesta.service;

import com.mongodb.MongoException;
import com.pe.encuesta.model.EncuestaResult;
import com.pe.encuesta.model.Usuario;

public interface EncuestaService {
	public EncuestaResult inicializarEncuesta(Usuario user)throws MongoException; 
}
