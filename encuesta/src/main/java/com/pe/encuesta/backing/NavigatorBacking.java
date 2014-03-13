package com.pe.encuesta.backing;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pe.encuesta.util.Constants;

@ManagedBean(name="navigatorBean")
@ViewScoped
public class NavigatorBacking implements Serializable {
	
	
	private static final long serialVersionUID = 5995923575703316558L;
	private String loginPage;
	
	
	public String getLoginPage() {
		return loginPage;
	}


	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}
	
	
	public String loginNavigator(){
						
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setLoginPage(Constants.LOGIN_PAGE);
		return null;
	}


	public void printIt(){
		 
		//Get submit button id
		System.out.println("WAS PRINTED");
 
	}

}
