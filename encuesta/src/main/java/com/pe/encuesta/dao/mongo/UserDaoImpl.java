package com.pe.encuesta.dao.mongo;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import com.mongodb.DBObject;
import com.pe.encuesta.dao.UserDao;
import com.pe.encuesta.model.Usuario;
import com.pe.encuesta.util.Constants;
import com.pe.encuesta.util.MongoConnection;

public class UserDaoImpl implements UserDao {
	
	private static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Inject
	protected MongoConnection mongoConnection; 

	@Override
	public boolean validateUser(Usuario user) {
		// TODO Auto-generated method stub
		DBObject userMongoObject= mongoConnection.getDb().getCollection(Constants.USUARIO_COLLECTION).findOne();
		logger.info(" userMongoObject "+userMongoObject);
//		String username=(String) userMongoObject.get("username");
//		String password=(String)userMongoObject.get("clave");
		return true;
	}

}
