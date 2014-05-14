package main.java.ar.com.nicodp.ageatest.service;

import java.util.ArrayList;
import java.util.List;

import main.java.ar.com.nicodp.ageatest.dao.SystemDAO;
import main.java.ar.com.nicodp.ageatest.model.TSistema;
import main.java.ar.com.nicodp.ageatest.bean.System;

import org.apache.log4j.Logger;


/** 
 * Service Implementation 
 * 
 * Contains methods to retrieve and work with the system beans from the database
 * 
 * @author  Nicolás Díaz País <nico@diazpais.com.ar>
 * @package main.java.ar.com.nicodp.ageatest.service
 * @license https://raw.githubusercontent.com/nicodiaz/ageatest/master/LICENSE
 */
public class SystemService implements Service {

	private static final Logger logger = Logger.getLogger(SystemService.class);

	private SystemDAO systemDAO;

	/**
	 * Retrieve every row from the database system table
	 * 
	 * @return List<System>
	 */
	@Override
	public List<System> getAll() {
		List<System> result = new ArrayList<System>();
		
		List<TSistema> data = systemDAO.getAll();
		
		for (TSistema tSistema : data) 
		{
			result.add(generateSystemBean(tSistema));
		}
		
		return result; 
	}

	
	/**
	 * Build an XML string containing the system information
	 * 
	 * @return String
	 */
	@Override
	public String getXML(System system) {
		
		// Preconditions
		if (system == null)
		{
			throw new IllegalArgumentException("Intento de Conversion de XML con objeto nulo");
		}
		
		String result = "<?xml version='1.0' encoding='UTF-8'?>"
						+ "<system>" 
						+		"<id>"+system.getId()+"</id>"
						+ 		"<name>"+system.getName()+"</name>"
						+ 		"<description>"+system.getDescription()+"</description>"
						+ "</system>";
		
		return result;
	}

	/**
	 * Retrieve a single system row indexed by Id
	 * 
	 * @return System
	 */
	@Override
	public System get(int id) {
		return getSystemById(id);
	}

	public void setSystemDAO(SystemDAO systemDAO) {
		this.systemDAO = systemDAO;
	}
	
	
	/**
	 * Get the system by id
	 * 
	 * @internal
	 * @param id
	 * @return
	 */
	protected System getSystemById(int id)
	{
		if (id <= 0) {
			logger.error("Intento de recupero de sistema con id nulo");
			return null;
		}
		
		TSistema model = systemDAO.findById(id);
		
		return generateSystemBean(model);
	}
	
	/**
	 * Create a new complete System Bean from the model data
	 * 
	 * @param model
	 * @return
	 */
	protected System generateSystemBean(TSistema model)
	{
		System result = new System();
		
		result.setId(model.getId());
		result.setName(model.getName());
		result.setDescription(model.getDescripcion());
	
		return result;
	}

}
