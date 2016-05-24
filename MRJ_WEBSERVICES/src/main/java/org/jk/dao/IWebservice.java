package org.jk.dao;

import java.util.List;

import org.jk.entities.Webservice;

public interface IWebservice {
	
	
	public List<Webservice> listWebservices();
	public Webservice getWebservice(String name);
	public void deleteWebservice(String name);
	public void updateWebservice(Webservice w);
	public void addWebservice(Webservice w);

}
