package org.jk.web;

import java.util.List;


import org.jk.entities.Webservice;

import org.jk.service.IWebservice_Service;

import org.jk.service.SingletonService2;
import com.opensymphony.xwork2.ActionSupport;

public class WebserviceAction extends ActionSupport {

	public String name;
	public boolean editMode=false;
	
	public Webservice webservice =new Webservice();
	
	public List<Webservice> webservices;
	
	private IWebservice_Service service= SingletonService2.getService();
	
	public String index(){
		webservices=service.listWebservices();
		return SUCCESS;
		
		
	}

	public String save(){
		
		if(editMode==false){
		service.addWebservice(new Webservice(webservice.getName(),webservice.getIp(),webservice.getPort(),webservice.getDescription(),webservice.isREST()));
		
		}
		
		else {
			service.updateWebservice(webservice);
			//pour repasser en mode save: 
			editMode=false;
			// pour vider le formulaire:
			webservice= new Webservice();
		}
		webservices=service.listWebservices();
		return SUCCESS;
		
		
	}
	
	public String delete(){
		service.deleteWebservice(name);
		webservices=service.listWebservices();
		return SUCCESS;
		
		
	}

	public String edit(){
		editMode=true;
		webservice=service.getWebservice(name);
		webservices=service.listWebservices();
		return SUCCESS;
		
		
	}
	
	
	
}

	
		
	
	
	
	
	

