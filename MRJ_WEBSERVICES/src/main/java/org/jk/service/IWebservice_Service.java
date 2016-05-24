package org.jk.service;

import java.util.List;

import org.jk.entities.Webservice;

public interface IWebservice_Service {
	
	public void addWebservice(Webservice w);
	public List<Webservice> listWebservices();
	public Webservice getWebservice(String name);
	public void deleteWebservice(String name);
	public void updateWebservice(Webservice w);

}
