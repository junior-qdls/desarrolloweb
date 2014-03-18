package com.pe.encuesta.service.mongo;

import javax.inject.Inject;

import com.mongodb.MongoException;
import com.pe.encuesta.dao.EncuestaDao;
import com.pe.encuesta.model.EncuestaResult;
import com.pe.encuesta.model.Usuario;
import com.pe.encuesta.service.EncuestaService;

public class EncuestaServiceImpl implements EncuestaService {
	
	@Inject
	private EncuestaDao encuestaDao;

	@Override
	public EncuestaResult inicializarEncuesta(Usuario user)
			throws MongoException {
		// TODO Auto-generated method stub		
		return encuestaDao.inicializarEncuesta(user);				
		
	}

}
