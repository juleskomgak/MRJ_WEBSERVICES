package org.jk.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.jk.entities.Webservice;

public class WebserviceImpl implements IWebservice {
	
	Map<String, Webservice> webs = new HashMap<String, Webservice>();

	
	
	public void addWebservice(Webservice w) {
		
		webs.put(w.getName(),w);


	}

	public List<Webservice> listWebservices() {
		
		return new ArrayList<Webservice>(webs.values());
	}

	public Webservice getWebservice(String name) {
		
		return webs.get(name);
	}

	public void deleteWebservice(String name) {
		webs.remove(name);

	}

	public void updateWebservice(Webservice w) {
		webs.put(w.getName(),w);

	}
	
	public void initialiserRegistre(){
		addWebservice(new Webservice("table1","192.168.0.26",8080,"API pour produits..",true));	
		addWebservice(new Webservice("table2","192.168.0.28",8080,"API pour fournisseurs..",true));
	
	
	}

}
