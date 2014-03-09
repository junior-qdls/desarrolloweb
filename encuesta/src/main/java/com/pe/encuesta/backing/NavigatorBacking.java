package com.pe.encuesta.backing;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import org.omg.PortableServer.ServantActivator;

import com.pe.encuesta.util.Constants;

@ManagedBean(name="navigatorBean")
@RequestScoped
public class NavigatorBacking implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5995923575703316558L;
	private String loginPage;
	
	
	public String getLoginPage() {
		return loginPage;
	}


	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}
	
	
	
	
	
	public void loginNavigator(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setLoginPage(Constants.LOGIN_PAGE);
	}




}
