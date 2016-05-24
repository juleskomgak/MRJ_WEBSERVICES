package org.jk.service;

import java.util.List;


import org.jk.dao.IWebservice;
import org.jk.entities.Webservice;

public class Webservice_serviceIMPLE implements IWebservice_Service {

	private IWebservice wdao;
	
	
	
	public void setWdao(IWebservice wdao) {
		this.wdao = wdao;
	}
	
	

	public void addWebservice(Webservice w) {
		wdao.addWebservice(w);
		
		
	}

	public List<Webservice> listWebservices() {
		
		return wdao.listWebservices();
	}

	public Webservice getWebservice(String name) {
		
		return wdao.getWebservice(name);
	}

	public void deleteWebservice(String name) {
		wdao.deleteWebservice(name);
		
	}

	public void updateWebservice(Webservice w) {
		wdao.updateWebservice(w);
		
	}
	
	
	

}
