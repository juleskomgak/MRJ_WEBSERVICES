package org.jk.service;


import org.jk.dao.WebserviceImpl;

public class SingletonService2 {

private static Webservice_serviceIMPLE service;
	
	static {
		WebserviceImpl wdao= new WebserviceImpl();
		wdao.initialiserRegistre();
		service= new Webservice_serviceIMPLE();
		service.setWdao(wdao);
		
	}

	public static Webservice_serviceIMPLE getService() {
		return service;
	}

}
