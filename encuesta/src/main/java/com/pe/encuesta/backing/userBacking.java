package com.pe.encuesta.backing;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pe.encuesta.model.Usuario;



@Named("userBean")
@RequestScoped
public class userBacking implements Serializable {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2308418724915259461L;
	private static final Logger logger = LoggerFactory.getLogger(userBacking.class);
	
	
	private Usuario user;
	
	

	
	public Usuario getUser() {
		return user;
	}


	public void setUser(Usuario user) {
		this.user = user;
	}


	@PostConstruct
	public void initialize(){
		System.out.println("initializing ");
		logger.info("initializing");
		
	}

	
	public void validateLogin(){
		logger.error("validatin login");
		
	}
	
	
	
}
