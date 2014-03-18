package com.pe.encuesta.dao;

import com.mongodb.MongoException;
import com.pe.encuesta.model.EncuestaResult;
import com.pe.encuesta.model.Usuario;

public interface EncuestaDao {
	
	public EncuestaResult inicializarEncuesta(Usuario user)throws MongoException;
	
	 
	

}
