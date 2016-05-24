package org.jk.entities;

import java.io.Serializable;

public class Webservice implements Serializable {
	
	private String name;
	private String ip;
	private int port;
	private String description;
	private boolean REST;
	public Webservice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Webservice(String name, String ip, int port, String description, boolean rEST) {
		super();
		this.name = name;
		this.ip = ip;
		this.port = port;
		this.description = description;
		REST = rEST;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isREST() {
		return REST;
	}
	public void setREST(boolean rEST) {
		REST = rEST;
	}
	
	
	

}
