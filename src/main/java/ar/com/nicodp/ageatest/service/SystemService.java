package main.java.ar.com.nicodp.ageatest.service;

import java.util.ArrayList;
import java.util.List;

import main.java.ar.com.nicodp.ageatest.dao.SystemDAO;
import main.java.ar.com.nicodp.ageatest.model.TSistema;
import main.java.ar.com.nicodp.ageatest.bean.System;

import org.apache.log4j.Logger;

public class SystemService implements Service {

	private static final Logger logger = Logger.getLogger(SystemService.class);

	private SystemDAO systemDAO;

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
