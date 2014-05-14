package main.java.ar.com.nicodp.ageatest.action;

import main.java.ar.com.nicodp.ageatest.bean.System;
import main.java.ar.com.nicodp.ageatest.service.SystemService;

import com.opensymphony.xwork2.ActionSupport;


/** 
 * Action to retrieve the XML from specific system
 * 
 * @param GET requestedSystemId
 * 
 * @author  Nicolás Díaz País <nico@diazpais.com.ar>
 * @package main.java.ar.com.nicodp.ageatest.action
 * @license https://raw.githubusercontent.com/nicodiaz/ageatest/master/LICENSE
 */
public class XmlAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SystemService systemService;

	private System selected;
	
	private int requestSystemId;

	@Override
	public String execute() throws Exception {

		/*
		 * An alternative could be use the getXML method on SystemService. 
		 * 
		 * String output = systemService.getXML(systemService.get(requestSystemId));
		 * 
		 */
		selected = systemService.get(requestSystemId);
		
		return SUCCESS;
	}

	public void setSystemService(SystemService systemService) {
		this.systemService = systemService;
	}

	public System getSelected() {
		return selected;
	}

	public void setSelected(System selected) {
		this.selected = selected;
	}

	public int getRequestSystemId() {
		return requestSystemId;
	}

	public void setRequestSystemId(int requestSystemId) {
		this.requestSystemId = requestSystemId;
	}


}
