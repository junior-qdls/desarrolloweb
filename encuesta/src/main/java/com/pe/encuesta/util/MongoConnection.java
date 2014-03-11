package com.pe.encuesta.util;

import java.net.UnknownHostException;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoConnection {
	
	private static final Logger logger = LoggerFactory.getLogger(MongoConnection.class);
	private MongoClient mongoClient;
	private DB db;
	@PostConstruct
	public void initializeMongo(){
		logger.info("The mongo connection is creating");
		try {
			mongoClient=new MongoClient();
			db=mongoClient.getDB(Constants.DB_NAME);
			boolean isAuthorized=db.authenticate(Constants.DB_USER, Constants.DB_PASSWORD.toCharArray());
			if(isAuthorized){
				logger.info("the user is authorized");
			}else{
				logger.error("the user is not authorized");
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			logger.error("couldnt intialize the mongo client");
			e.printStackTrace();
		}			
	}	
	
	public DB getDb(){
		return db;
	}
	
}
