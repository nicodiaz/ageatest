package main.java.ar.com.nicodp.ageatest.service;

import java.util.List;

import main.java.ar.com.nicodp.ageatest.bean.System;

public interface Service {
	
	
	public List<System> getAll();
	
	public String getXML(System system);
	
	public System get(int id);
	
	

}
