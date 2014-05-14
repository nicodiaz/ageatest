package main.java.ar.com.nicodp.ageatest.service;

import java.util.List;

import main.java.ar.com.nicodp.ageatest.bean.System;

/** 
 * Service Type (Interface) 
 * 
 * Contains methods to retrieve and work with the system beans
 * 
 * @author  Nicolás Díaz País <nico@diazpais.com.ar>
 * @package main.java.ar.com.nicodp.ageatest.service
 * @license https://raw.githubusercontent.com/nicodiaz/ageatest/master/LICENSE
 */
public interface Service {
	
	
	public List<System> getAll();
	
	public String getXML(System system);
	
	public System get(int id);
	
	

}
