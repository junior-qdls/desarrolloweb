package com.pe.encuesta.service.mongo;

import javax.inject.Inject;

import com.pe.encuesta.dao.UserDao;
import com.pe.encuesta.model.Usuario;
import com.pe.encuesta.service.UserService;

public class UserServiceImpl implements UserService {

	@Inject
	protected UserDao userDao;
	
	
	@Override
	public boolean validateUser(Usuario user) {
		// TODO Auto-generated method stub
		return userDao.validateUser(user);
	}

}
