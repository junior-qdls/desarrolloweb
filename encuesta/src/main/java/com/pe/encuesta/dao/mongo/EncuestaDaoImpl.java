package com.pe.encuesta.dao.mongo;


import javax.inject.Inject;

import org.bson.types.ObjectId;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.MongoException;
import com.pe.encuesta.dao.EncuestaDao;
import com.pe.encuesta.model.EncuestaResult;
import com.pe.encuesta.model.Usuario;
import com.pe.encuesta.util.MongoConnection;

public class EncuestaDaoImpl implements EncuestaDao {
	
	@Inject
	protected MongoConnection mongoConnection;

	@Override
	public EncuestaResult inicializarEncuesta(Usuario user)throws MongoException {
		// TODO Auto-generated method stub
		
		EncuestaResult result=new EncuestaResult();
		
		try {
			ObjectId codigoEncuesta=new ObjectId();
			
			DBCollection collection=mongoConnection.getDb().getCollection("encuesta");
					
			BasicDBObject document=new BasicDBObject();
			document.put("_id", codigoEncuesta);
			document.put("owner",user.getCodigoUsuario());					
			collection.insert(document);			
			
			result.setValue(codigoEncuesta.toString());
						
		}
		 catch (MongoException   e) {
			// TODO: handle exception
			e.printStackTrace();
			result.setCodeMessage(e.getCode());
			result.setMessage(e.getMessage());
		}
						
		return result;
	}

}
